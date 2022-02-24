package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "tour_flights")
@Getter
@Setter
public class TourFlight {
    @Id
    private Integer flightCode;

    @Column
    private String aviaCompany;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column
    private Date departureDate;

    @Column
    @DateTimeFormat(pattern = "hh:mm:ss")
    private Time departureTime;

    @Column
    private String departureCity;

    @Column
    private String arrivalCity;

    @Column
    private String direction;

    @ManyToOne
    private Tour tour;
}
