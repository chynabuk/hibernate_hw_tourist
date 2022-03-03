package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "agreements")
@Getter
@Setter
@NoArgsConstructor
public class Agreement {
    @Id
    private Integer agreementNumber;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column
    private Date formalizationDate;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "tour_number")
    private Tour tour;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "client_number")
    private Client client;
}
