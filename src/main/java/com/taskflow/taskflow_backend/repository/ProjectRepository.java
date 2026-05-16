package com.taskflow.taskflow_backend.repository;

import com.taskflow.taskflow_backend.entity.Project;
import com.taskflow.taskflow_backend.entity.User;
import com.taskflow.taskflow_backend.enums.Priority;
import com.taskflow.taskflow_backend.enums.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    List<Project> findByOwner(User user);
    List<Project> findByOwnerAndStatus(User user, ProjectStatus status);
    List<Project> findByOwnerAndPriority(User user, Priority priority);
}
