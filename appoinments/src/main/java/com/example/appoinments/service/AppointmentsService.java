package com.example.appoinments.service;

import com.example.appoinments.model.Appointments;
import com.example.appoinments.repository.AppointmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class AppointmentsService {

    @Autowired
    AppointmentsRepository appointmentsRepository;

    @Autowired
    RestTemplate restTemplate;

    public Appointments getUserByBookingId(int bookingId) {
        return appointmentsRepository.getById(bookingId);
    }

    public Appointments updateAppointments(Appointments appointments) {
        return appointmentsRepository.save(appointments);
    }

    public void deleteAppointmentById(int appointments) {
        appointmentsRepository.deleteById(appointments);
    }

    public List<Appointments> getAllAppointment() {
        return appointmentsRepository.findAll();
    }

}
