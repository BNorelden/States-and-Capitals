package com.states2.states2Lombok.stateAPI;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CapitalDAO extends CrudRepository<Capital, Integer> {

//    List<Capital> getAllCapitals();
//    void saveOrUpdate(Capital capital);
//    void removeCapitalById(int capitalId);
//
//    Object findCapitalById(int capitalId);
//    List<Capital> findCapitalByName(String capitalName);
}
