package com.example.states.dao;

import com.example.states.entity.Capital;

import java.util.List;

public interface CapitalDAO {

    List<Capital> getAllCapitals();
    void saveOrUpdate(Capital capital);
    void removeCapitalById(int capitalId);

    Object findCapitalById(int capitalId);
    List<Capital> findCapitalByName(String capitalName);
}
