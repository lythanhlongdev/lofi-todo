package com.ltldev.be_lofi_todo.api;

import com.ltldev.be_lofi_todo.dto.user.LoginDto;
import com.ltldev.be_lofi_todo.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserAPI {

    private final AuthenticationService service;
    @PostMapping("login")
    public ResponseEntity<?> authenticate(@RequestBody @Valid LoginDto request) {
        return new ResponseEntity<>(service.login(request), HttpStatus.OK);
    }
}
