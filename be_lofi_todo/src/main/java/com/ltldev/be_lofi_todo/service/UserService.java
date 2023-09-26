package com.ltldev.be_lofi_todo.service;

import com.ltldev.be_lofi_todo.entity.User;

public interface UserService {

    User getByUserName(String username);

    User save(User user);
}
