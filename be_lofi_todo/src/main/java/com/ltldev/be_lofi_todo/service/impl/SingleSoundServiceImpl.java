package com.ltldev.be_lofi_todo.service.impl;

import com.ltldev.be_lofi_todo.entity.SingleSound;
import com.ltldev.be_lofi_todo.repository.SingleSoundRepository;
import com.ltldev.be_lofi_todo.service.SingleSoundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SingleSoundServiceImpl implements SingleSoundService {

    private final SingleSoundRepository repository;
    @Override
    public List<SingleSound> findAll() {
        return repository.findAll();
    }
}
