package com.example.msevent.services.serviceImpls;

import com.example.msevent.dao.EventResponse;
import com.example.msevent.entities.EventEntity;
import com.example.msevent.mappers.EventMapper;
import com.example.msevent.repositories.EventRepository;
import com.example.msevent.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;

    }
    @Override
    public List<EventResponse> getAllEvents() {
        return eventMapper.mapToResponse(eventRepository.findAll());
    }

    @Override
    public EventEntity getEventById(long id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public EventEntity saveEvent(EventEntity event) {
        return eventRepository.save(event);
    }

    @Override
    public void deleteEvent(long id) {
        eventRepository.deleteById(id);
    }
}
