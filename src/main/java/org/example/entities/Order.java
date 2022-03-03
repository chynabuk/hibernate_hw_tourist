package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order {
    @Id
    private Integer orderNumber;

    @ManyToOne
    @JoinColumn(name = "employee_passport_number")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "tour_number")
    private Tour tour;
}
