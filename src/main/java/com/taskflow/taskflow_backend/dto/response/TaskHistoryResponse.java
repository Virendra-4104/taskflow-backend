package com.taskflow.taskflow_backend.dto.response;

import com.taskflow.taskflow_backend.enums.TaskHistoryAction;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TaskHistoryResponse {
    private Long id;
    private Long taskId;
    private Long createdById;
    private TaskHistoryAction action;
    private String oldValue;
    private String newValue;
    private LocalDateTime createAt;
}
