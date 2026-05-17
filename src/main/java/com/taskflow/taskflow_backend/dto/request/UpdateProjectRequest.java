package com.taskflow.taskflow_backend.dto.request;

import com.taskflow.taskflow_backend.enums.Priority;
import com.taskflow.taskflow_backend.enums.ProjectStatus;

public record UpdateProjectRequest(
        String title,
        String description,
        ProjectStatus status,
        Priority priority
) {}
