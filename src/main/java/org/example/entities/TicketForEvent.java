package org.example.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tickets_for_events")
@Getter
@Setter
public class TicketForEvent{
    @Id
    private Integer ticketNumber;

    @JoinColumn(name = "event_id")
    @ManyToOne
    private Event event;
}
