package com.example.states.service;

import com.example.states.entity.Capital;

import java.util.List;

public interface CapitalService {

    List<Capital> getAllCapitals();
    void saveOrUpdate(Capital capital);
    void removeCapitalById(int capitalId);

    Object findCapitalById(int capitalId);
    List<Capital> findCapitalByName(String capitalName);
}
