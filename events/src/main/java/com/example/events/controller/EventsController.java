package com.example.events.controller;

import com.example.events.model.Events;
import com.example.events.service.EventsService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventsController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    EventsService eventsService;

    @GetMapping("/{userId}")
    public Events getEventsByUserId(@PathVariable int userId) {

        return eventsService.getEventsByUserId(userId);
    }


    @PutMapping("/updateEvents")
    public Events updateEvents(@RequestBody Events events) {

        return eventsService.updateEvents(events);
    }

    @DeleteMapping("/{userId}")
    public String deleteEventsByUserId(@PathVariable int userId) {

        eventsService.deleteEventsByUserId(userId);

        return "Events Details Deleted";
    }

    @GetMapping("/get/all/events")
    public List<Events> findAllEvents() {
        return eventsService.getAllEvents();
    }


//    @GetMapping("/get")
//    public String get() {
////        String events = restTemplate.getForObject("http://APPOINTMENTS-SERVICE/Appointments", String.class);
//        return "events";
//
//    }
}


