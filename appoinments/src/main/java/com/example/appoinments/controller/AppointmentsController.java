package com.example.appoinments.controller;

import com.example.appoinments.model.Appointments;
import com.example.appoinments.service.AppointmentsService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentsController {

    @Autowired
    private AppointmentsService appointmentsService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{bookingId}")
    public Appointments getUserByUserId(@PathVariable int bookingId) {
        return appointmentsService.getUserByBookingId(bookingId);
    }


    @PutMapping("/updateUser")
    public Appointments updateUser(@RequestBody Appointments appointments) {
        return appointmentsService.updateAppointments(appointments);
    }

    @DeleteMapping("/{userId}")
    public String deleteUserByUserId(@PathVariable int bookingId) {
        appointmentsService.deleteAppointmentById(bookingId);
        return "appointments Details Deleted";
    }

    @GetMapping("/get/all/User")
    public List<Appointments> findAllUser() {
        return appointmentsService.getAllAppointment();
    }

//    @GetMapping("/get")
//    public String get() {
//        return "welcome appointments";
//    }
}
