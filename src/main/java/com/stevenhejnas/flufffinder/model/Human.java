package com.stevenhejnas.flufffinder.model;

import lombok.Data;
import javax.persistence.*;



@Data
@Entity
@Table(name= "humans")
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer id;
    private String city;
    private String state;
    private boolean likesCats;
    private boolean likesDogs;

}
