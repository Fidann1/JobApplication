package com.example.msevent.services;

import com.example.msevent.dao.EventResponse;
import com.example.msevent.entities.EventEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {
    List<EventResponse> getAllEvents();
    EventEntity getEventById(long id);
    EventEntity saveEvent(EventEntity event);
    void deleteEvent(long id);
}
