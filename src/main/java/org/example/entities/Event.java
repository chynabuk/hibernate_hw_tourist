package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
public class Event extends BaseEntity{
    @Column
    private String city;

    @Column
    private String eventPlace;

    @Column
    @DateTimeFormat(pattern = "hh:mm:ss")
    private Time startTime;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "tour_number")
    private Tour tour;
}
