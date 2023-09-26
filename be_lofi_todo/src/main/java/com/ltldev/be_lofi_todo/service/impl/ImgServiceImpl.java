package com.ltldev.be_lofi_todo.service.impl;

import com.ltldev.be_lofi_todo.entity.Img;
import com.ltldev.be_lofi_todo.repository.ImgRepository;
import com.ltldev.be_lofi_todo.service.ImgService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ImgServiceImpl implements ImgService {

    private final ImgRepository repository;

    @Override
    public List<Img> findAll() {
        return repository.findAll();
    }
}
