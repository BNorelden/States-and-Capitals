package com.example.states.dao;

import com.example.states.entity.Capital;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CapitalIMPL implements CapitalDAO{

    private final EntityManager entityManager;

    @Autowired
    public CapitalIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public List<Capital> getAllCapitals() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Capital> getAllCapitalsQ = currentSession.createQuery("from Capital");
        return getAllCapitalsQ.getResultList();
    }

    @Override
    @Transactional
    public void saveOrUpdate(Capital capital) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(capital);
    }

    @Override
    @Transactional
    public void removeCapitalById(int capitalId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Capital capital = currentSession.get(Capital.class,capitalId);
        currentSession.delete(capital);
    }



    @Override
    @Transactional
    public Object findCapitalById(int capitalId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Capital.class,capitalId);
    }

    @Override
    @Transactional
    public List<Capital> findCapitalByName(String capitalName) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Capital> findCapitalByNameQ = currentSession.createQuery("from Capital where capital_name like '%"+capitalName+"%'");
        return findCapitalByNameQ.getResultList();
    }
}
