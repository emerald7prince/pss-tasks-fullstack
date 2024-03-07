package com.emeraldprince.PssTasks.service;

import com.emeraldprince.PssTasks.entity.Task;
import com.emeraldprince.PssTasks.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
@Data
@AllArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

//    public List<Task> findAllByProjectId(Long projectId) {
//        return taskRepository.findAllByProjectId(projectId);
//    }

}
