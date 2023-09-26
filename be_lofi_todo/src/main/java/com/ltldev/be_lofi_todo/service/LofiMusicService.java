package com.ltldev.be_lofi_todo.service;

import com.ltldev.be_lofi_todo.entity.LofiMusic;

import java.util.List;
import java.util.Optional;

public interface LofiMusicService {
    List<LofiMusic> findAll();
    Optional findByTitle(String title);
}
