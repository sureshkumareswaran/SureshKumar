package com.example.events.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_events")
public class Events {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int userId;
    @Column(name = "event")
    private List<Events> eventsList;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "event_day")
    private DayOfWeek eventDay;
    @Column(name = "start_date")
    private LocalDateTime startDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(name = "no_seat")
    private int noOfSeat;
    @Column(name = "event_details")
    private String eventDetails;
    @Column(name = "event_organizer")
    private String eventOrganizer;

}
