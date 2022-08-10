package com.example.gradecontroiier;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GradeController {
    ArrayList grade=new ArrayList();

    @GetMapping("/grade")
    public ArrayList getGrade(){
        return grade;
    }

    @PostMapping ("/qrade/{index}")
    public String addGrade(@PathVariable String grade){
        addGrade(grade);
        return "posts new grade";
    }
    @PutMapping ("/qrade/{index}")
    public String updateGrade(@PathVariable String grade){
       updateGrade(grade);
        return "update grade";
    }
   @DeleteMapping ("/grade/{index}")
    public String deleteGrade(@PathVariable String grade){
        deleteGrade(grade);
        return "deletes grade";
   }


}
