package org.example.entities;

import org.example.enums.AviaClassEnum;

import javax.persistence.*;

@Entity
@Table(name = "avia_classes")
public class AviaClass extends BaseEntity{
    @Column
    @Enumerated(EnumType.STRING)
    private AviaClassEnum aviaClassEnum;
}
