package com.technoraj.springsecurity.service;

import com.technoraj.springsecurity.Repository.AppUser;
import com.technoraj.springsecurity.Repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService{

    @Autowired
    AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {


        AppUser appUser = appUserRepository.findByUserName(userName);

        return new User(appUser.getUserName(), appUser.getUserPassword(), new ArrayList<>());
    }
}
