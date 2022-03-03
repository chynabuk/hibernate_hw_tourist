package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tours")
@Getter
@Setter
@NoArgsConstructor
public class Tour {
    @Id
    private Integer tourNumber;

    @ManyToOne
    @JoinColumn(name = "tour_type_id")
    private TourType tourType;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date startDate;

    @Column
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "program_number")
    private Program program;

    @Column
    private String name;

    @Column
    private String status;
}
