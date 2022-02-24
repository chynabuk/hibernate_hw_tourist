package org.example.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee{
    @Id
    private Long passportNumber;

    @JoinColumn(name = "position_id")
    @OneToOne
    private Position position;

    @Column
    private String fullName;

    @Column
    private String address;
}