package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "avia_tickets")
public class AviaTicket {
    @Id
    private Integer aviaTicketCode;

    @Column
    private String place;

    @ManyToOne
    private TourFlight tourFlight;

    @JoinColumn(name = "avia_class_code")
    @ManyToOne
    private AviaClass aviaClass;
}
