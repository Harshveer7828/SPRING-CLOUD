package com.springsecurity.spring_security.service;

import com.springsecurity.spring_security.model.Users;
import com.springsecurity.spring_security.model.UserPricipal;
import com.springsecurity.spring_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users1 = userRepository.findByUsername(username);

        if (users1 == null){
            throw new UsernameNotFoundException("Users by username: " + username + " is not found");
        }

        return new UserPricipal(users1);
    }
}
