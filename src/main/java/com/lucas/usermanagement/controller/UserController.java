package com.lucas.usermanagement.controller;

import com.lucas.usermanagement.controller.dto.LoginRequest;
import com.lucas.usermanagement.domain.User;
import com.lucas.usermanagement.repository.UserRepository;
import com.lucas.usermanagement.service.JwtService;
import com.lucas.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private JwtService jwtService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping
    public List<User> list() {
        return userService.findAll();
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request){
        User user = repository.findByEmail(request.email()).orElseThrow(()-> new RuntimeException("Usuario não Encontrado"));
        if(!encoder.matches(request.password(), user.getPassword())){
            throw new RuntimeException("Senha inválida");
        }
        return jwtService.generatedToken(user.getEmail());
    }
}
