package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.HotelNumberCategoryEnum;

import javax.persistence.*;

@Entity
@Table(name = "hotel_number_categories")
@Getter
@Setter
public class HotelNumberCategory {
    @Id
    @Enumerated(EnumType.STRING)
    private HotelNumberCategoryEnum hotelNumberCategoryEnum;
}
