package com.emeraldprince.PssTasks.repository;

import com.emeraldprince.PssTasks.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
