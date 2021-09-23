package com.example.states.dao;

import com.example.states.entity.Capital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CapitalIMPL implements CapitalDAO{

    private final EntityManager entityManager;

    @Autowired
    public CapitalIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //TO WORK ON AFTER I FINISH THE STATE

    @Override
    public List<Capital> getAllCapitals() {
        return null;
    }

    @Override
    public void saveOrUpdate(Capital capital) {

    }

    @Override
    public void removeCapitalById(int capitalId) {

    }

    @Override
    public Object findCapitalById(int capitalId) {
        return null;
    }

    @Override
    public List<Capital> findCapitalByName(String capitalName) {
        return null;
    }
}
