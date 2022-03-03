package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.CountriesEnum;

import javax.persistence.*;

@Entity
@Table(name = "countries")
@Getter
@Setter
@NoArgsConstructor
public class Country extends BaseEntity{
    @Column
    @Enumerated(EnumType.STRING)
    private CountriesEnum countriesEnum;
}
