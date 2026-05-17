package com.taskflow.taskflow_backend.dto.request;

import jakarta.validation.constraints.NotNull;

public record AddProjectMemberRequest(
        @NotNull(message = "Project id is required")
        Long projectId,

        @NotNull(message = "User id is required")
        Long userId
)
{}
