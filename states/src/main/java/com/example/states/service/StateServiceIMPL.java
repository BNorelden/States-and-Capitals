package com.example.states.service;

import com.example.states.dao.StateDAO;
import com.example.states.entity.State;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceIMPL implements StateService{
    private final StateDAO stateDAO;

    public StateServiceIMPL(StateDAO stateDAO) {
        this.stateDAO = stateDAO;
    }

    @Override
    public List<State> getAllStates() {
        return stateDAO.getAllStates();
    }

    @Override
    public void saveOrUpdate(State state) {
        stateDAO.saveOrUpdate(state);
    }

    @Override
    public void removeStateById(int stateId) {
        stateDAO.removeStateById(stateId);
    }

    @Override
    public Object getStateById(int stateId) {
        return stateDAO.getStateById(stateId);
    }

    @Override
    public List<State> searchStateByName(String theName) {
        return stateDAO.searchStateByName(theName);
    }
}
