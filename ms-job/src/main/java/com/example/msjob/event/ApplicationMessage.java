package com.example.msjob.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApplicationMessage {
    private Long jobId;
}
