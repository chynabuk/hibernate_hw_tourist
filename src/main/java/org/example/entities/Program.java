package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "programs")
@Getter
@Setter
@NoArgsConstructor
public class Program{
    @Id
    private Integer programNumber;

    @Column
    private String description;
}
