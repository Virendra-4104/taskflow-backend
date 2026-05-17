package com.taskflow.taskflow_backend.dto.request;

import com.taskflow.taskflow_backend.enums.TaskStatus;
import jakarta.validation.constraints.NotNull;

public record UpdateTaskStatusRequest(
        @NotNull(message = "Status is required")
        TaskStatus status
) {}
