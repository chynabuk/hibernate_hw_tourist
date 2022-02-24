package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.PositionTypeEnum;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Position extends BaseEntity{
    @Column
    @Enumerated(EnumType.STRING)
    private PositionTypeEnum roleType;
}
