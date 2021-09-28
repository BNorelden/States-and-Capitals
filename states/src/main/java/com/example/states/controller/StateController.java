package com.example.states.controller;

import com.example.states.entity.State;
import com.example.states.service.StateService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StateController {
    private final StateService stateService;

    public StateController(@Qualifier("stateServiceIMPL") StateService stateService) {
        this.stateService = stateService;
    }

    //http://localhost:8080/getAllStates
    @GetMapping("/getAllStates")
    public List<State> getStates(){
        return stateService.getAllStates();
}

    //http://localhost:8080/addState
    @PostMapping("/addState")
    public State addState(@RequestBody State state){
        state.setState_id(0);//so it adds another record in the database
        stateService.saveOrUpdate(state);
        return state;
    }

    // http://localhost:8080/updateState
    @PutMapping("/updateState")
    public State updateState(@RequestBody State state){
        stateService.saveOrUpdate(state);
        return state;
    }

    // http://localhost:8080/deleteState/{stateId}
    @DeleteMapping("/deleteState/{stateId}")
    public String deleteState(@PathVariable int stateId){
        stateService.removeStateById(stateId);
        return "Deleting State with ID: "+stateId;
    }

    // http://localhost:8080/getStateById/{stateId}
    @GetMapping("/getStateById/{stateId}")
    public Object getStateById(@PathVariable int stateId){

        return stateService.getStateById(stateId);
    }

    // http://localhost:8080/getStateByName/{stateName}
    @GetMapping("/getStateByName/{stateName}")
    public List<State> getStateByName(@PathVariable String stateName){
        return stateService.searchStateByName(stateName);
    }
}
