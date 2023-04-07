package com.Birhan.onlineCRUD.controller;

import com.Birhan.onlineCRUD.Bean.Subject;
import com.Birhan.onlineCRUD.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SubjectController {
    @Autowired

    private SubjectService subjectService;
    @RequestMapping("/subjects")// url name

    public List<Subject> getAllSubjects(){
        // call service class
        return subjectService.getAllSubject();// read

    }
    @RequestMapping(method = RequestMethod.POST, value = "/subjects")
    public void addSubject(@RequestBody Subject subject){
        //call service
        SubjectService.addSubject(subject);

    }
    @RequestMapping(method = RequestMethod.PUT, value = "/subjects{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject){
        //call service
        SubjectService.updateSubject(subject);

    }
    public void DeleteSubject(@PathVariable String id, @RequestBody Subject subject){
        // call delete method
        SubjectService.deleteService(id);
    }




}
