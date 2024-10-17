package com.springProject.MySpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.MySpringProject.entity.Student;
import com.springProject.MySpringProject.repository.StudentRepository;

@RestController
public class StudentController {
     @Autowired
	StudentRepository repository;
     @GetMapping("/students")
     public List<Student> getAllStudents(){
    	 List<Student> students = repository.findAll();
    	 return students;
     }
     
     @GetMapping("/students/{id}")
     public Student getStudent(@PathVariable int id ) {
    	 Student students = repository.findById(id).get();
    	 return students;
     }
     
     @PostMapping("/student/add")
     @ResponseStatus(code = HttpStatus.CREATED)
     public Student postStudent(@RequestBody Student student) {
    	 Student stud = repository.save(student);
    	 return stud;
     }
     
     @PutMapping("/student/update/{id}")
     public Student updateStudent(@PathVariable int id) {
    	 Student student = repository.findById(id).get();
    	 student.setName("sri");
    	 student.setPercentage(54);
    	 repository.save(student);
    	 return student;
     }
     
     @DeleteMapping("student/delete/{id}")
     public Student deleteStudent(@PathVariable int id) {
    	 Student student = repository.findById(id).get();
    	 repository.delete(student);
    	 return student;
     }

}
