package com.emeraldprince.PssTasks.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@ManyToOne
    //private Project project;
    private String taskName;
    private String taskComment;

}
