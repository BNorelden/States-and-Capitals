package com.example.states.entity;

import javax.persistence.*;

@Entity
@Table(name="us_state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int state_id;

    @Column(name="state_name")
    private String state_name;

    @Column(name = "state_postal_abbreviation")
    private String state_postal_abbreviation;

    @Column(name = "state_slogan")
    private String state_slogan;

    public State() {
    }

    public State(String state_name, String state_postal_abbreviation, String state_slogan) {
        this.state_name = state_name;
        this.state_postal_abbreviation = state_postal_abbreviation;
        this.state_slogan = state_slogan;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getState_postal_abbreviation() {
        return state_postal_abbreviation;
    }

    public void setState_postal_abbreviation(String state_postal_abbreviation) {
        this.state_postal_abbreviation = state_postal_abbreviation;
    }

    public String getState_slogan() {
        return state_slogan;
    }

    public void setState_slogan(String state_slogan) {
        this.state_slogan = state_slogan;
    }

    @Override
    public String toString() {
        return "State{" +
                "state_id=" + state_id +
                ", state_name='" + state_name + '\'' +
                ", state_postal_abbreviation='" + state_postal_abbreviation + '\'' +
                ", state_slogan='" + state_slogan + '\'' +
                '}';
    }
}
