package com.ltldev.be_lofi_todo.service;

import com.ltldev.be_lofi_todo.dto.user.AuthDto;
import com.ltldev.be_lofi_todo.dto.user.LoginDto;
import com.ltldev.be_lofi_todo.dto.user.UserDto;
import com.ltldev.be_lofi_todo.entity.User;

public interface AuthenticationService {

    User login(LoginDto request);
    User Register(UserDto request);
}
