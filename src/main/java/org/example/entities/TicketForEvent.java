package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tickets_for_events")
@Getter
@Setter
@NoArgsConstructor
public class TicketForEvent{
    @Id
    private Integer ticketNumber;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
