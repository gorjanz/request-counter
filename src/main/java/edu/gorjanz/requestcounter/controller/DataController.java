package edu.gorjanz.requestcounter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping(path = "/check")
    public String checkIfAllowed() {
        return "Congrats you're allowed";
    }
}
