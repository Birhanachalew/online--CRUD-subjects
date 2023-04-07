package com.Birhan.onlineCRUD.service;

import com.Birhan.onlineCRUD.Bean.Subject;
import com.Birhan.onlineCRUD.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    //reference variable
    public static SubjectRepository subjectRepository;



    public List<Subject> getAllSubject(){
        // class repository
        List<Subject> subjects = new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);// method reference and iterate through foreach loop
        return subjects;

    }
    public static void addSubject(Subject subject) {
        // call method of repo
        subjectRepository.save(subject);// directly subject table

    }
    public static void updateSubject(Subject subject) {
        subjectRepository.save(subject);
    }
    public static void deleteService(String id) {
        subjectRepository.deleteById(id);
    }

}
