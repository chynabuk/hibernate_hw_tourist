package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "")
@Getter
@Setter
@NoArgsConstructor
public class PermitTicket {
    @Id
    private Integer permitTicketNumber;

    @ManyToOne
    @JoinColumn(name = "ticket_for_event_number")
    private TicketForEvent ticketForEvent;

    @ManyToOne
    @JoinColumn(name = "permit_number")
    private Permit permit;
}
