package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "permits")
@Getter
@Setter
@NoArgsConstructor
public class Permit {
    @Id
    private Integer permitNumber;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "agreement_number")
    private Agreement agreement;

    @ManyToOne
    @JoinColumn(name = "tourist_passport_number")
    private Tourist tourist;

}
