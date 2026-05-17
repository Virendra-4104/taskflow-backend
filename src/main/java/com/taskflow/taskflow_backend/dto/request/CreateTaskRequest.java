package com.taskflow.taskflow_backend.dto.request;

import com.taskflow.taskflow_backend.enums.Priority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CreateTaskRequest(

        @NotBlank(message = "Title is required")
        String title,

        String description,

        Long projectId,

        Long assignedToId,

        @NotNull(message = "Priority is required")
        Priority priority,

        LocalDate dueDate
) {}
