package com.ltldev.be_lofi_todo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "task")
public class Task extends BaseLong{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "task_id")
//    private Long taskId;

    @Column(name = "title", nullable = true, length = 50)
    private String title;
    @Column(name = "description")
    private String description;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "todo_list")
    private String todoList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;
}
