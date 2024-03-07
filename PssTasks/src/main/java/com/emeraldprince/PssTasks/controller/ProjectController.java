package com.emeraldprince.PssTasks.controller;

import com.emeraldprince.PssTasks.entity.Project;
import com.emeraldprince.PssTasks.entity.Task;
import com.emeraldprince.PssTasks.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("projects/addProject")
    public Project addProject(@RequestBody Project project) {
        return projectService.save(project);
    }

    @GetMapping("projects/{id}")
    public Optional<Project> findProject(@PathVariable long id) {
        return projectService.findById(id);
    }

    @GetMapping("projects/")
    public List<Project> findAllProjects() {
        return projectService.findAll();
    }

}
