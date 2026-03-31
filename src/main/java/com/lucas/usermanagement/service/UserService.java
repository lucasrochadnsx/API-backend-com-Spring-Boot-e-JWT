package com.lucas.usermanagement.service;

import com.lucas.usermanagement.domain.User;
import com.lucas.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.support.RepositoryMethodInvocationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;


    public User create(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
