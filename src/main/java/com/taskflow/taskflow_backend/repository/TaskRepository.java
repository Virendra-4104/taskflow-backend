package com.taskflow.taskflow_backend.repository;

import com.taskflow.taskflow_backend.entity.Project;
import com.taskflow.taskflow_backend.entity.Task;
import com.taskflow.taskflow_backend.entity.User;
import com.taskflow.taskflow_backend.enums.Priority;
import com.taskflow.taskflow_backend.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findByCreatedBy(User user);

    List<Task> findByCreatedByAndStatus(User user, TaskStatus status);

    List<Task> findByCreatedByAndPriority(User user, Priority priority);

//    =========================================================

    List<Task> findByProject(Project project);

    List<Task> findByAssignedTo(User user);

    List<Task> findByProjectAndStatus(Project project, TaskStatus status);

    List<Task> findByAssignedToAndStatus(User user, TaskStatus status);
}
