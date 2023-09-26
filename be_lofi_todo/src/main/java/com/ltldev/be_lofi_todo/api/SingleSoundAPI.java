package com.ltldev.be_lofi_todo.api;

import com.ltldev.be_lofi_todo.entity.Img;
import com.ltldev.be_lofi_todo.entity.SingleSound;
import com.ltldev.be_lofi_todo.service.ImgService;
import com.ltldev.be_lofi_todo.service.SingleSoundService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/user/sounds")
public class SingleSoundAPI {

    private final SingleSoundService service;

    @GetMapping("/")
    ResponseEntity<ResponseObject> findAll(){
        List<SingleSound> SingleSounds = service.findAll();
        return !SingleSounds.isEmpty() ?
                ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok","Query  All Single Sounds Successfully ",SingleSounds))
                :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("NOT_FOUND","Query  All Single Sounds False because folder empty "," "))
                ;
    }
}
