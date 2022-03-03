package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "avia_tickets")
@Getter
@Setter
@NoArgsConstructor
public class AviaTicket {
    @Id
    private Integer aviaTicketCode;

    @Column
    private String place;

    @ManyToOne
    @JoinColumn(name = "flight_code")
    private TourFlight tourFlight;

    @ManyToOne
    @JoinColumn(name = "avia_class_code")
    private AviaClass aviaClass;
}
