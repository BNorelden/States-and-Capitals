package com.states2.states2Lombok.stateAPI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CapitalController {
    private final CapitalServiceIMPL capitalServiceIMPL;


    public CapitalController(@Qualifier("capitalServiceIMPL") CapitalServiceIMPL capitalServiceIMPL) {
        this.capitalServiceIMPL = capitalServiceIMPL;
    }

//    //http://localhost:8080/getAllCapitals
//    @GetMapping("/getAllCapitals")
//    public List<Capital> getAllCapitals(){
//        return capitalServiceIMPL.getAllCapitals();
//    }
//
//    @PostMapping("/addCapital")
//    public Capital addCapital(@RequestBody Capital capital){
//        capital.setCapital_id(0);
//        capitalServiceIMPL.saveOrUpdate(capital);
//        return capital;
//    }
//
//    @PutMapping("/updateCapital")
//    public Capital updateCapital(@RequestBody Capital capital){
//        capitalServiceIMPL.saveOrUpdate(capital);
//        return capital;
//    }
//
//    @DeleteMapping("/deleteCapital/{capitalId}")
//    public String deleteCapital(@PathVariable int capitalId){
//        capitalServiceIMPL.removeCapitalById(capitalId);
//        return "Capital with Id:"+capitalId+" was removed!";
//    }
//
//    // http://localhost:8080/getCapitalById/{capitalId}
//    @GetMapping("/getCapitalById/{capitalId}")
//    public Object getCapitalById(@PathVariable int capitalId){
//
//        return capitalServiceIMPL.findCapitalById(capitalId);
//    }
//
//    // http://localhost:8080/getCapitalByName/{capitalName}
//    @GetMapping("/getCapitalByName/{capitalName}")
//    public List<Capital> getCapitalByName(@PathVariable String capitalName){
//        return capitalServiceIMPL.findCapitalByName(capitalName);
//    }

}
