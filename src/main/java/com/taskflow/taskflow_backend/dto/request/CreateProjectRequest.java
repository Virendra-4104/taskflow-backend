package com.taskflow.taskflow_backend.dto.request;

import com.taskflow.taskflow_backend.enums.Priority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CreateProjectRequest(
        @NotBlank(message = "Title is required")
        @Size(min = 2, max = 150, message = "Title must be between 2 and 150 characters")
        String title,

        String description,

        @NotNull(message = "Priority is required")
        Priority priority
) {}
