package git.jogindermikael.SpringSecExa.service;

import git.jogindermikael.SpringSecExa.model.UserPrincipal;
import git.jogindermikael.SpringSecExa.model.Users;
import git.jogindermikael.SpringSecExa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@EnableWebSecurity
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = repo.findByUsername(username);
        if(user == null){
            IO.println("User not found");
            throw new UsernameNotFoundException("User not found");
        }else{
            IO.println("User found: " + user);
            return new UserPrincipal(user);
//            return org.springframework.security.core.userdetails.User.builder()
//                    .username(user.getUsername())
//                    .password(user.getPassword())
//                    .build();
        }
    }
}
