package com.emeraldprince.PssTasks.controller;

import com.emeraldprince.PssTasks.entity.Task;
import com.emeraldprince.PssTasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("tasks/addTask")
    public Task addTask(@RequestBody Task task) {
        return taskService.save(task);
    }

    @GetMapping("tasks/{id}")
    public Optional<Task> findTask(@PathVariable Long id) {
        return taskService.findById(id);
    }

    @GetMapping("tasks/")
    public List<Task> findAllTasks() {
        return taskService.findAll();
    }

//    @GetMapping("projects/{id}/tasks")
//    public List<Task> findAllByProjectId(@PathVariable Long id) {
//        return taskService.findAllByProjectId(id);
//    }

}
