package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "hotel_number_permits")
@Getter
@Setter
public class HotelNumberPermit {
    @Id
    private Integer hotelNumberPermitCode;

    @NonNull
    @JoinColumn(name = "hote_number_code")
    @ManyToOne
    private HotelNumber hotelNumber;

    @NonNull
    @JoinColumn(name = "permit_number")
    @ManyToOne
    private Permit permit;
}
