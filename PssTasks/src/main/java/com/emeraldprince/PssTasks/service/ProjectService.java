package com.emeraldprince.PssTasks.service;

import com.emeraldprince.PssTasks.entity.Project;
import com.emeraldprince.PssTasks.entity.Task;
import com.emeraldprince.PssTasks.repository.ProjectRepository;
import com.emeraldprince.PssTasks.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public Project save(Project project) {
        return projectRepository.save(project);
    }

    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    public List<Project> findAll() {
        return projectRepository.findAll();
    }

}
