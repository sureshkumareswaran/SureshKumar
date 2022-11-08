package com.example.appoinments.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_appointments")
public class Appointments {
    @Id
    @Column(name = "booking-id")
    private long bookingId;

    @Column(name = "start-date")
    private LocalDateTime startDate;

    @Column(name = "end-date")
    private LocalDateTime endDate;

    @Column(name = "message")
    private String message;

    @Column(name = "wallet_point")
    private long walletPoint;

}
