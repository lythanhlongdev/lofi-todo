package com.ltldev.be_lofi_todo.dto.user;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginDto {

    @NotBlank // not null
    private  String userName;

    @NotBlank // not null
    private  String password;
}
