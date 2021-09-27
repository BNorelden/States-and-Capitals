package com.example.states.service;

import com.example.states.dao.CapitalDAO;
import com.example.states.entity.Capital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapitalServiceIMPL implements CapitalService{
private final CapitalDAO capitalDAO;

    @Autowired
    public CapitalServiceIMPL(CapitalDAO capitalDAO) {
        this.capitalDAO = capitalDAO;
    }

    @Override
    public List<Capital> getAllCapitals() {
        return capitalDAO.getAllCapitals();
    }

    @Override
    public void saveOrUpdate(Capital capital) {
        capitalDAO.saveOrUpdate(capital);
    }

    @Override
    public void removeCapitalById(int capitalId) {
        capitalDAO.removeCapitalById(capitalId);
    }

    @Override
    public Object findCapitalById(int capitalId) {
        return capitalDAO.findCapitalById(capitalId);
    }

    @Override
    public List<Capital> findCapitalByName(String capitalName) {
        return capitalDAO.findCapitalByName(capitalName);
    }
}
