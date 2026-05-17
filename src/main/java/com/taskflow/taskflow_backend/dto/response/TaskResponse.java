package com.taskflow.taskflow_backend.dto.response;

import com.taskflow.taskflow_backend.enums.Priority;
import com.taskflow.taskflow_backend.enums.TaskStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class TaskResponse {

    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private Priority priority;
    private LocalDate dueDate;
    private Long projectId;
    private Long createdById;
    private String createdByUsername;
    private Long assignedToId;
    private String assignedToUsername;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
