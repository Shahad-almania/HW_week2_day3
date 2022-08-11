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
    public String addName(@RequestBody String N){
        NAME.add(N);
        return "post new name";
    }
    @PutMapping  ("/people/{index}")
    public String updateName(@PathVariable int index,@RequestBody String N){
        NAME.set(index,N);
        return "updates name";
    }
    @DeleteMapping ("/people/{index}")
    public String deleteName(@PathVariable int index){
        NAME.remove(index);
        return "deletes name";
    }

    }
