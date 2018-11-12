package com.eltishehu.oauth.config;

import com.eltishehu.oauth.data.entities.User;
import com.eltishehu.oauth.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by e.sh. on 12-Nov-18
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByName(username);
        return new org.springframework.security.core.userdetails.User(
                                user.getName(),
                                user.getPassword(),
                                user.getRoles());
    }
}
