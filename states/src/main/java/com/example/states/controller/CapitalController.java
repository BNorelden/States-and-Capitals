package com.example.states.controller;

import com.example.states.entity.Capital;
import com.example.states.service.CapitalService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CapitalController {
    private final CapitalService capitalService;


    public CapitalController(@Qualifier("capitalServiceIMPL") CapitalService capitalService) {
        this.capitalService = capitalService;
    }

    //http://localhost:8080/getAllCapitals
    @GetMapping("/getAllCapitals")
    public List<Capital> getAllCapitals(){
        return capitalService.getAllCapitals();
    }

    @PostMapping("/addCapital")
    public Capital addCapital(@RequestBody Capital capital){
        capital.setCapital_id(0);
        capitalService.saveOrUpdate(capital);
        return capital;
    }

    @PutMapping("/updateCapital")
    public Capital updateCapital(@RequestBody Capital capital){
        capitalService.saveOrUpdate(capital);
        return capital;
    }

    @DeleteMapping("/deleteCapital/{capitalId}")
    public String deleteCapital(@PathVariable int capitalId){
        capitalService.removeCapitalById(capitalId);
        return "Capital with Id:"+capitalId+" was removed!";
    }

    // http://localhost:8080/getCapitalById/{capitalId}
    @GetMapping("/getCapitalById/{capitalId}")
    public Object getCapitalById(@PathVariable int capitalId){

        return capitalService.findCapitalById(capitalId);
    }

    // http://localhost:8080/getCapitalByName/{capitalName}
    @GetMapping("/getCapitalByName/{capitalName}")
    public List<Capital> getCapitalByName(@PathVariable String capitalName){
        return capitalService.findCapitalByName(capitalName);
    }

}
