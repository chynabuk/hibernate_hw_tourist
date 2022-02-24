package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.HotelClassEnum;

import javax.persistence.*;

@Entity
@Table(name = "hotel_class")
@Getter
@Setter
public class HotelClass{
    @Id
    @Enumerated(EnumType.STRING)
    private HotelClassEnum hotelClassEnum;
}
