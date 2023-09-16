package com.ltldev.be_lofi_todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "single_sound")
public class SingleSounds extends BaseLong{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "single_sounds_id")

//    private Integer singleSoundId;
    private String title;
    private String author;
    private String description;
    private String url;


    public SingleSounds(String title, String author, String description, String url) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.url = url;
    }
}
