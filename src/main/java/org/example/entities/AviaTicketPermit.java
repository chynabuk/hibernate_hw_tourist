package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "avia_ticket_tours")
public class AviaTicketPermit {
    @Id
    private Integer aviaTickedPermitCode;

    @JoinColumn(name = "avia_ticket_code")
    @ManyToOne
    private AviaTicket aviaTicket;

    @JoinColumn(name = "permit_id")
    @ManyToOne
    private Permit permit;
}
