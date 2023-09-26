package com.ltldev.be_lofi_todo.api;

import com.ltldev.be_lofi_todo.entity.LofiMusic;
import com.ltldev.be_lofi_todo.entity.SingleSound;
import com.ltldev.be_lofi_todo.service.LofiMusicService;
import com.ltldev.be_lofi_todo.service.SingleSoundService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/user/lofi")
public class LofiMusicAPI {

    private final LofiMusicService service;

    @GetMapping("")
    ResponseEntity<ResponseObject> findAll() {
        List<LofiMusic> musics = service.findAll();
        return !musics.isEmpty() ?
                ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "Query  All music Successfully ", musics))
                :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("NOT_FOUND", "Query  All music False because folder empty ", " "))
                ;
    }

    @GetMapping("/{title}")
    ResponseEntity<ResponseObject> findByTitle(@PathVariable String title) {
        Optional music = service.findByTitle(title);
        return music != null ?
                ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "Query  music Successfully  title: " + title, music))
                :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("NOT_FOUND", "Query   music False  title: " + title, " "))
                ;
    }


}
