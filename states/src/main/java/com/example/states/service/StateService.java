package com.example.states.service;

import com.example.states.entity.State;

import java.util.List;

public interface StateService {

    List<State> getAllStates();
    void saveOrUpdate(State state);
    void removeStateById(int stateId);

    Object getStateById(int stateId);
    List<State> searchStateByName(String theName);

}
