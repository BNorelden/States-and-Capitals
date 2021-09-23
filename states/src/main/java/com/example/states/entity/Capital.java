package com.example.states.entity;

import javax.persistence.*;

@Entity
@Table(name = "us_capital")
public class Capital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int capital_id;

    @Column(name = "capital_name")
    private String capital_name;

    @Column(name = "state_postal_abbreviation")
    private String state_postal_abbreviation;

    public Capital(int capital_id) {
        this.capital_id = capital_id;
    }

    public Capital(String capital_name, String state_postal_abbreviation) {
        this.capital_name = capital_name;
        this.state_postal_abbreviation = state_postal_abbreviation;
    }

    public int getCapital_id() {
        return capital_id;
    }

    public void setCapital_id(int capital_id) {
        this.capital_id = capital_id;
    }

    public String getCapital_name() {
        return capital_name;
    }

    public void setCapital_name(String capital_name) {
        this.capital_name = capital_name;
    }

    public String getState_postal_abbreviation() {
        return state_postal_abbreviation;
    }

    public void setState_postal_abbreviation(String state_postal_abbreviation) {
        this.state_postal_abbreviation = state_postal_abbreviation;
    }

    @Override
    public String toString() {
        return "Capital{" +
                "capital_id=" + capital_id +
                ", capital_name='" + capital_name + '\'' +
                ", state_postal_abbreviation='" + state_postal_abbreviation + '\'' +
                '}';
    }
}
