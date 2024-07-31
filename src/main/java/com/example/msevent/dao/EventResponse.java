package com.example.msevent.dao;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class EventResponse {

    private String eventName;
    private String description;
    private LocalDateTime eventDate;
}
