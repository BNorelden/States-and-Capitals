package com.example.states.dao;

import com.example.states.entity.State;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public List<State> getAllStates() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<State> getStatesQuery = currentSession.createQuery("from State");
        return getStatesQuery.getResultList();
    }

    @Override
    @Transactional
    public void saveOrUpdate(State state) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(state);
    }

    @Override
    @Transactional
    public void removeStateById(int stateId) {
        Session currentSession = entityManager.unwrap(Session.class);
        State state = currentSession.get(State.class,stateId);
        currentSession.delete(state);

    }

    @Override
    @Transactional
    public Object getStateById(int stateId) {
        Session currentSession = entityManager.unwrap(Session.class);

        return currentSession.get(State.class, stateId);
    }

    @Override
    @Transactional
    public List<State> searchStateByName(String theName) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<State> getStateNameQuery = currentSession.createQuery("from State where state_name like '%"+theName+"%'");
        return getStateNameQuery.getResultList();
    }
}
