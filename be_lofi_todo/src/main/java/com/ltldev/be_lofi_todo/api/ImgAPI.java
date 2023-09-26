package com.ltldev.be_lofi_todo.api;

import com.ltldev.be_lofi_todo.entity.Img;
import com.ltldev.be_lofi_todo.service.ImgService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/user/img")
public class ImgAPI {
    private final ImgService service;

    @GetMapping("")
    ResponseEntity<ResponseObject> findAll(){
        List<Img> imgs = service.findAll();
        return !imgs.isEmpty() ?
                ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok","Query  All Img Successfully ",imgs))
                :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("NOT_FOUND","Query  All Img False because folder empty "," "))
                ;
    }

}
