package org.example.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "")
@Getter
@Setter
public class PermitTicket {
    @Id
    private Integer permitTicketNumber;

    @JoinColumn(name = "ticket_for_event_number")
    @ManyToOne
    private TicketForEvent ticketForEvent;

    @JoinColumn
    @ManyToOne
    private Permit permit;
}
