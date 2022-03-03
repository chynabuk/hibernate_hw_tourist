package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.HotelClassEnum;

import javax.persistence.*;

@Entity
@Table(name = "hotel_class")
@Getter
@Setter
@NoArgsConstructor
public class HotelClass extends BaseEntity{
    @Column
    @Enumerated(EnumType.STRING)
    private HotelClassEnum hotelClassEnum;
}
