package com.example.msevent.mappers;

import com.example.msevent.dao.EventRequest;
import com.example.msevent.dao.EventResponse;
import com.example.msevent.entities.EventEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public enum EventMapper {
    EVENT_MAPPER;

    public EventEntity mapToEntity(EventRequest eventRequest) {
        return EventEntity.builder().
                eventName(eventRequest.getEventName()).
                description(eventRequest.getDescription()).
                eventDate(eventRequest.getEventDate()).build();
    }

    public EventResponse mapToResponse(EventEntity eventEntity) {
        return EventResponse.builder().
                eventName(eventEntity.getEventName()).
                eventDate(eventEntity.getEventDate()).
                description(eventEntity.getDescription()).build();
    }

    public List<EventResponse> mapToResponse(List<EventEntity> eventEntity) {
        return eventEntity.stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }
}
