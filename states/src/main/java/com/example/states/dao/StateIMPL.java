package com.example.states.dao;

import com.example.states.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StateIMPL implements StateDAO{

    private final EntityManager entityManager;

    @Autowired
    public StateIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<State> getAllStates() {
        return null;
    }

    @Override
    public void saveOrUpdate(State state) {

    }

    @Override
    public void removeStateById(int stateId) {

    }

    @Override
    public Object getStateById(int stateId) {
        return null;
    }

    @Override
    public List<State> searchStateByName(String theName) {
        return null;
    }
}
