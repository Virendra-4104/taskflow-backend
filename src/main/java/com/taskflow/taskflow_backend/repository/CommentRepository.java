package com.taskflow.taskflow_backend.repository;

import com.taskflow.taskflow_backend.entity.Comment;
import com.taskflow.taskflow_backend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTask(Task task);
}
