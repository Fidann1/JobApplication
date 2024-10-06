package com.example.msapplication.event;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Data
public class ApplicationMessage {
    private Long jobId;
}
