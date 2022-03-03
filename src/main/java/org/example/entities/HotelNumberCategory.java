package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.HotelNumberCategoryEnum;

import javax.persistence.*;

@Entity
@Table(name = "hotel_number_categories")
@Getter
@Setter
@NoArgsConstructor
public class HotelNumberCategory extends BaseEntity{
    @Column
    @Enumerated(EnumType.STRING)
    private HotelNumberCategoryEnum hotelNumberCategoryEnum;
}
