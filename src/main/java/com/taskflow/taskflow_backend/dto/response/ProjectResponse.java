package com.taskflow.taskflow_backend.dto.response;

import com.taskflow.taskflow_backend.enums.Priority;
import com.taskflow.taskflow_backend.enums.ProjectStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ProjectResponse {
    private Long id;
    private String title;
    private String description;
    private UserResponse owner;
    private List<UserResponse> members;
    private ProjectStatus status;
    private Priority priority;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
