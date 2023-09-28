package com.states2.states2Lombok.stateAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //wow getters, setters and toString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="us_state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int state_id;

    private String state_name;

    private String state_postal_abbreviation;

    private String state_slogan;

}
