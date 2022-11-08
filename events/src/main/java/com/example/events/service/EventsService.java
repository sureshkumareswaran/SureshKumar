package com.example.events.service;

import com.example.events.model.Events;
import com.example.events.repository.EventsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EventsService {
    @Autowired
   private EventsRepository eventsRepository;

    @Autowired
    RestTemplate restTemplate;

    public Events getEventsByUserId(int userId) {
       return eventsRepository.getById(userId);
    }

    public Events updateEvents(Events events) {
       return eventsRepository.save(events);

    }

    public void deleteEventsByUserId(int userId) {
        eventsRepository.deleteById(userId);
    }

    public List<Events> getAllEvents() {
        return eventsRepository.findAll();
    }
}
