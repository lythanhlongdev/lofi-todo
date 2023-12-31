package com.ltldev.be_lofi_todo.service.impl;

import com.ltldev.be_lofi_todo.dto.user.LoginDto;
import com.ltldev.be_lofi_todo.dto.user.UserDto;
import com.ltldev.be_lofi_todo.entity.User;
import com.ltldev.be_lofi_todo.service.AuthenticationService;
import com.ltldev.be_lofi_todo.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserService userService;

//    private final ModelMapper mapper;

    @Override
    public User login(LoginDto request) {
        User user = userService.getByUserName(request.getUserName());
        if (user != null && user.getPass().equals(request.getPassword())) {
            return  user;
        }
        return null;
    }

    @Override
    public User Register(UserDto request) {
        User user = userService.getByUserName(request.getUserName());
        if (user == null){
            return userService.save(user);
        }
        return null;
    }

}
