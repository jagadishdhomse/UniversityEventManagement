package com.university.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.university.Repository.StudentModelRepository;

import com.university.dto.StudentModel;
@RestController
public class Controller1 {
@Autowired
StudentModelRepository smr;


    @PostMapping("/addstudent")
    public String addStudent(@RequestBody StudentModel s) {
    	smr.save(s);
    	return "Data added";
    }
    @GetMapping("/getstudent")
    public StudentModel getstudentbyId(@RequestParam int studentid)
    {
    	Optional<StudentModel> o  = smr.findById(studentid);
    	StudentModel st = o.get();
    	return st;
    }
    @PutMapping("/updatestudent")
    public String updatestudent(@RequestBody StudentModel s) {
    	smr.save(s);
    	return "Data updated";
    }
    @GetMapping("/getstudentbyname")
    public List<StudentModel> getStudentbyfirstname(@RequestParam String firstname){
    	List<StudentModel> std = smr.findByFirstname(firstname);
    	return std;
    }
    @GetMapping("/getallstudent")
    public List<StudentModel> findallStudent()
    {
    	List<StudentModel> std = smr.findAll();
    	return std;
    }

   
 
	
    
}
