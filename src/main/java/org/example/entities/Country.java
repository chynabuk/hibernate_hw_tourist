package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.CountriesEnum;

import javax.persistence.*;

@Entity
@Table(name = "countries")
@Getter
@Setter
public class Country{
    @Id
    @Enumerated(EnumType.STRING)
    CountriesEnum countriesEnum;
}
