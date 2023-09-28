package com.states2.states2Lombok.stateAPI;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StateController {
    private final StateServiceIMPL stateServiceIMPL;

    public StateController(@Qualifier("stateServiceIMPL") StateServiceIMPL stateServiceIMPL) {
        this.stateServiceIMPL = stateServiceIMPL;
    }

    @RequestMapping(method=RequestMethod.GET, value="/states", produces={"application/json"})
    public Iterable<State> getStates2() {
        return stateServiceIMPL.findAll();
    }

}
