package com.ltldev.be_lofi_todo.repository;

import com.ltldev.be_lofi_todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User getByUserName(String username);
}
