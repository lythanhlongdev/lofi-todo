package com.ltldev.be_lofi_todo.repository;

import com.ltldev.be_lofi_todo.entity.SingleSound;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleSoundRepository extends JpaRepository<SingleSound,Byte> {
}
