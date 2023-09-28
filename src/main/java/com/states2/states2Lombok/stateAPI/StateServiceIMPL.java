package com.states2.states2Lombok.stateAPI;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StateServiceIMPL{
    private StateDAO stateDAO;

    public Iterable<State> findAll(){
        return stateDAO.findAll();
    }

    public Optional<State> findById(int theId){
        return stateDAO.findById(3);

    }
//public class StateServiceIMPL implements StateService{
//    private final StateDAO stateDAO;
//
//    public StateServiceIMPL(StateDAO stateDAO) {
//        this.stateDAO = stateDAO;
//    }
//
//    @Override
//    public List<State> getAllStates() {
//        return stateDAO.getAllStates();
//    }
//
//    @Override
//    public void saveOrUpdate(State state) {
//        stateDAO.saveOrUpdate(state);
//    }
//
//    @Override
//    public void removeStateById(int stateId) {
//        stateDAO.removeStateById(stateId);
//    }
//
//    @Override
//    public Object getStateById(int stateId) {
//        return stateDAO.getStateById(stateId);
//    }
//
//    @Override
//    public List<State> searchStateByName(String theName) {
//        return stateDAO.searchStateByName(theName);
//    }
}
