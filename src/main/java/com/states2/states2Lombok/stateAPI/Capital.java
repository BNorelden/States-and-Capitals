package com.states2.states2Lombok.stateAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //wow getters, setters and toString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "us_capital")
public class Capital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int capital_id;

    private String capital_name;

    private String state_postal_abbreviation;


}
