package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tours")
@Getter
@Setter
public class Tour {
    @Id
    private Integer tourNumber;

    @JoinColumn(name = "tour_type")
    @ManyToOne
    private TourType tourType;

    @JoinColumn(name = "country")
    @ManyToOne
    private Country country;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column
    private Date startDate;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column
    private Date endDate;

    @JoinColumn(name = "program_number")
    @ManyToOne
    private Program program;

    @Column
    private String name;

    @Column
    private String status;
}
