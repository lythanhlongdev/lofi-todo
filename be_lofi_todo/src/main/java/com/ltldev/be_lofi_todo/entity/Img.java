package com.ltldev.be_lofi_todo.entity;


import jakarta.persistence.Entity;
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
public class Img extends BaseByte implements Serializable {

    private String title;
    private String description;
    private String url;
}
