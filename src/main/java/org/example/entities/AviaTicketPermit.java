package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "avia_ticket_tours")
@Getter
@Setter
@NoArgsConstructor
public class AviaTicketPermit {
    @Id
    private Integer aviaTickedPermitCode;

    @ManyToOne
    @JoinColumn(name = "avia_ticket_code")
    private AviaTicket aviaTicket;

    @ManyToOne
    @JoinColumn(name = "permit_number")
    private Permit permit;
}
