package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "permits")
@Getter
@Setter
public class Permit {
    @Id
    private Integer permitNumber;

    @NonNull
    @JoinColumn(name = "agreement_number")
    @ManyToOne
    private Agreement agreement;

    @OneToMany(mappedBy = "permits")
    private Set<Tourist> touristList;

}
