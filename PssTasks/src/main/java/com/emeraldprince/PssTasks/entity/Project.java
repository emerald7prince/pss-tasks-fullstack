package com.emeraldprince.PssTasks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String projectName;
//    @OneToMany(mappedBy = "project")
//    private List<Task> taskList;

}
