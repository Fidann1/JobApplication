package com.example.msapplication.event;

import com.example.msapplication.enums.StatusEnum;
import lombok.Builder;

@Builder
public class UserJobEvent {
    private Long userId;
    private StatusEnum status;
}
