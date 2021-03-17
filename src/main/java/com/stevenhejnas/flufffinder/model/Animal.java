package com.stevenhejnas.flufffinder.model;

import com.stevenhejnas.flufffinder.Species;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name= "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
    private String city;
    private String state;
    private Species species;


}
