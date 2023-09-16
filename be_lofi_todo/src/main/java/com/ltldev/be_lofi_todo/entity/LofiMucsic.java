package com.ltldev.be_lofi_todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lofi_music")
public class LofiMucsic extends  BaseLong{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "lofi_mucsic_id")

//    private Integer LofiMucsicId;
    private String title;
    private String author;
    private String description;
    private String url;
}
