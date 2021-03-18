package com.stevenhejnas.flufffinder.model;

import com.stevenhejnas.flufffinder.Species;
import lombok.Data;
import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Table(name= "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
    private String name;
    private String city;
    private String state;
    private Species species;
    private String description;
    private Instant createdOn = Instant.now();


}
