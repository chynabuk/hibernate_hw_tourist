package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.PositionTypeEnum;

import javax.persistence.*;

@Entity
@Table(name = "positions")
@Getter
@Setter
@NoArgsConstructor
public class Position extends BaseEntity{
    @Column
    @Enumerated(EnumType.STRING)
    private PositionTypeEnum positionType;
}
