package com.ltldev.be_lofi_todo.service.impl;

import com.ltldev.be_lofi_todo.entity.User;
import com.ltldev.be_lofi_todo.repository.UserRepository;
import com.ltldev.be_lofi_todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Override
    public User getByUserName(String username) {
        return repository.getByUserName(username);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }
}
