package com.example.appoinments.repository;

import com.example.appoinments.model.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentsRepository extends JpaRepository<Appointments,Integer> {
}
