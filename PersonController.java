package com.example.person_project;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PersonController {
    ArrayList<String> NAME=new ArrayList<>();

    @GetMapping("/people")
    public ArrayList getpeople(){
        return NAME;
    }

    @PostMapping ("/people")
    public String addName(@RequestBody String NAME){
        addName(NAME);
        return "post new name";
    }
    @PutMapping  ("/people")
    public String updateName(@RequestBody String NAME){
        updateName(NAME);
        return "updates name";
    }
    @DeleteMapping ("/people/{index}")
    public String deleteName(@PathVariable String NAME){
        addName(NAME);
        return "deletes name";
    }

    }
