package com.example.msevent.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EventRequest {

    private String eventName;
    private LocalDateTime eventDate;
    private String description;

}
