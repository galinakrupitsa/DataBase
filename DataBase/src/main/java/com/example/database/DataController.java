package com.example.database;

import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

@RestController
@RequestMapping
public class DataController {
    final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }
    @PostMapping("/user/{userId}")
    public String saveData(@PathVariable String userId, @RequestBody DataClass dataClass) {
        return dataClass.getLastName() + dataClass.getLastName();
    }
}
