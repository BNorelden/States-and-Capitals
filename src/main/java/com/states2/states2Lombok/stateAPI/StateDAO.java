package com.states2.states2Lombok.stateAPI;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StateDAO extends CrudRepository<State, Integer> {

//    List<State> getAllStates();
//    void saveOrUpdate(State state);
//    void removeStateById(int stateId);
//
//    Object getStateById(int stateId);
//    List<State> searchStateByName(String theName);
}
