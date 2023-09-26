package com.ltldev.be_lofi_todo.service.impl;

import com.ltldev.be_lofi_todo.entity.LofiMusic;
import com.ltldev.be_lofi_todo.repository.LofiMucsicRepository;
import com.ltldev.be_lofi_todo.service.LofiMusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LofiMusicServiceImpl implements LofiMusicService {

    private final LofiMucsicRepository repository;
    @Override
    public List<LofiMusic> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional findByTitle(String title) {
        return repository.findByTitle(title);
    }
}
