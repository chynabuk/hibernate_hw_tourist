package org.example.entities;

import lombok.Getter;
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
public class Agreement {
    @Id
    private Integer agreementNumber;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column
    private Date formalizationDate;

    @Nullable
    @JoinColumn(name = "tour_id")
    @ManyToOne
    private Tour tour;

    @NonNull
    @JoinColumn(name = "client_id")
    private Client client;
}
