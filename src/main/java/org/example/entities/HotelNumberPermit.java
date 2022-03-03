package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "hotel_number_permits")
@Getter
@Setter
@NoArgsConstructor
public class HotelNumberPermit {
    @Id
    private Integer hotelNumberPermitCode;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "hotel_number_code")
    private HotelNumber hotelNumber;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "permit_number")
    private Permit permit;
}
