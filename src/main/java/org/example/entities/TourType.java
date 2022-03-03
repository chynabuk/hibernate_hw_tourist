package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.TourTypeEnum;

import javax.persistence.*;

@Entity
@Table(name = "tour_types")
@Getter
@Setter
@NoArgsConstructor
public class TourType extends BaseEntity{
    @Column
    @Enumerated(EnumType.STRING)
    private TourTypeEnum tourTypeEnum;
}
