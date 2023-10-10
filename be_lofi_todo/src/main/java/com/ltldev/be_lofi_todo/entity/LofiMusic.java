package com.ltldev.be_lofi_todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lofi_music")
public class LofiMusic extends  BaseByte implements Serializable {

    private String title;
    private String author;
    private String description;
    private String url;
}
