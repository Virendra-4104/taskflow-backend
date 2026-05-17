package com.taskflow.taskflow_backend.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateComment(
        @NotBlank(message = "Content is required")
        String content,

        @NotNull(message = "Task id is required")
        Long taskId,

        @NotNull(message = "User id is required")
        Long userId
) {}
