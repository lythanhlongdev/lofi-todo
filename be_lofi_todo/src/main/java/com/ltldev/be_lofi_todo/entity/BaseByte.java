package com.ltldev.be_lofi_todo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseByte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_")
    private Byte id;
}
