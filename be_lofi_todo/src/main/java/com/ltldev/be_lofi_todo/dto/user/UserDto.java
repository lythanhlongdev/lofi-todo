package com.ltldev.be_lofi_todo.dto.user;

import com.ltldev.be_lofi_todo.enums.Role;
import lombok.Data;

@Data
public class UserDto {
    private String userName;
    private String pass;
    private String fullName;
    private String email;
    private Role role;

}
