package com.taskflow.taskflow_backend.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CommentResponse {
    private Long id;
    private String content;
    private Long taskId;
    private Long userId;
    private LocalDateTime createAt;
}
