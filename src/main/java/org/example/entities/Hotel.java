package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "hotels")
@Getter
@Setter
public class Hotel {
    @Id
    private Integer hotelCode;

    @Column
    private String city;

    @Column
    private String name;

    @Nullable
    @JoinColumn(name = "tour_id")
    @ManyToOne
    private Tour tour;

    @JoinColumn(name = "hotel_class")
    @ManyToOne
    private HotelClass hotelClass;
}
