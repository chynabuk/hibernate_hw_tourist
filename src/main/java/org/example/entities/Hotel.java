package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "hotels")
@Getter
@Setter
@NoArgsConstructor
public class Hotel {
    @Id
    private Integer hotelCode;

    @Column
    private String city;

    @Column
    private String name;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "tour_number")
    private Tour tour;

    @ManyToOne
    @JoinColumn(name = "hotel_class_id")
    private HotelClass hotelClass;
}
