package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
public class Employee{
    @Id
    private Integer passportNumber;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @Column
    private String fullName;

    @Column
    private String address;
}