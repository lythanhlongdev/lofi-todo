package com.ltldev.be_lofi_todo.repository;

import com.ltldev.be_lofi_todo.entity.LofiMusic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LofiMucsicRepository extends JpaRepository<LofiMusic,Byte> {
    Optional findByTitle(String title);
}
