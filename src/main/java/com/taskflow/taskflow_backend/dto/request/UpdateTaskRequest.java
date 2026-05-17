package com.taskflow.taskflow_backend.dto.request;

import com.taskflow.taskflow_backend.enums.Priority;
import com.taskflow.taskflow_backend.enums.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        TaskStatus status,
        Priority priority,
        LocalDate dueDate
) {}
