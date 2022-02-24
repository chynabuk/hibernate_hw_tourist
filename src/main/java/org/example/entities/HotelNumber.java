package org.example.entities;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hotel_numbers")
public class HotelNumber {
    @Id
    private Integer hotelNumberCode;

    @Column
    private String place;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column
    private Date departureDate;

    @NonNull
    @JoinColumn(name = "hotel_code")
    @ManyToOne
    private  Hotel hotel;

    @NonNull
    @JoinColumn(name = "hotel_number_category")
    @ManyToOne
    private HotelNumberCategory hotelNumberCategory;
}
