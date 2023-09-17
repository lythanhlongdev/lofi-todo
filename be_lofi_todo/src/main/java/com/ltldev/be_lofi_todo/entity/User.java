package com.ltldev.be_lofi_todo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User extends BaseLong {
    @Column(name = "user_name", length = 20)
    private String userName;

    @Column(name = "password", length = 12)
    private String pass;

    @Column(name = "full_name", length = 50)
    private String fullName;
    private String email;

//    private Date createDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Task> listTask;
}