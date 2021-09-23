package com.example.states.dao;

import com.example.states.entity.State;

import java.util.List;

public interface StateDAO {

    List<State> getAllStates();
    void saveOrUpdate(State state);
    void removeStateById(int stateId);

    Object getStateById(int stateId);
    List<State> searchStateByName(String theName);
}
