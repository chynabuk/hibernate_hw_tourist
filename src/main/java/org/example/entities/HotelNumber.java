package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hotel_numbers")
@Getter
@Setter
@NoArgsConstructor
public class HotelNumber {
    @Id
    private Integer hotelNumberCode;

    @Column
    private String place;

    @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date departureDate;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "hotel_code")
    private  Hotel hotel;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "hotel_number_category")
    private HotelNumberCategory hotelNumberCategory;
}
