package Basic.configs;

import Basic.domain.Role;
import Basic.domain.User;
import Basic.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepo myUserService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User myUser = myUserService.findByUsername(userName);

        if(myUser==null){
            throw new UsernameNotFoundException("Unknown user: "+userName);
        }

        Object[] roles = myUser.getRoles().toArray();
        UserDetails user = org.springframework.security.core.userdetails.User.builder()
                .username(myUser.getUsername())
                .password(myUser.getPassword())
//                .roles(roles.get(0).toString())
                .roles("USER")
                .build();
        return user;
    }
}