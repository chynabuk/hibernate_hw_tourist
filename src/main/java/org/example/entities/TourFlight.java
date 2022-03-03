package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "tour_flights")
@Getter
@Setter
@NoArgsConstructor
public class TourFlight {
    @Id
    private Integer flightCode;

    @Column
    private String aviaCompany;

    @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy")
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
    @JoinColumn(name = "tour_number")
    private Tour tour;
}
