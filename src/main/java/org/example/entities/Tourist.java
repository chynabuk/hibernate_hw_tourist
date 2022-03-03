package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tourists")
@Getter
@Setter
@NoArgsConstructor
public class Tourist {
    @Id
    private Integer passportNumber;

    @Column
    private String fullName;

    @Column
    private Integer age;

    @Column
    private String address;
}
