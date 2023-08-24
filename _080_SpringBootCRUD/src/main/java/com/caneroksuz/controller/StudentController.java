package com.caneroksuz.controller;

import com.caneroksuz.model.Student;
import com.caneroksuz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// http://localhost:8080/api/v1
@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public String getSelamlama(){
        return "Hoş geldiniz";
    }


    // http://localhost:8080/api/v1/hello?studentName=Caner
    @GetMapping("/hello")
    public String getHello(@RequestParam(value = "studentName", defaultValue = "World") String studentName){
        return "Hello " + studentName;
    }

   // http://localhost:8080/api/v1/students
    @GetMapping("/students")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    // http://localhost:8080/api/v1/students/1
    @GetMapping("/students/{id}")
    public Student getOneStudent(@PathVariable("id") Long id){
        return studentService.getOneStudent(id);
    }


    //POST - http://localhost:8080/api/v1/students
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    //UPDATE
    // http://localhost:8080/api/v1/students/1

    @PutMapping("/students/{id}")
    public Student updateOneStudent(@PathVariable("id") Long id, @RequestBody Student student){

        Student studentInfo = studentService.getOneStudent(id);
        if (studentInfo!=null){
            studentInfo.setId(id);
            studentInfo.setFirstName(student.getFirstName());
            studentInfo.setLastName(student.getLastName());
            studentInfo.setEmail(student.getEmail());
            return studentService.updateOneStudent(studentInfo);
        }
        return new Student();
    }

    //DELETE
    // http://localhost:8080/api/v1/students/1
    @DeleteMapping("/students/{id}")
    public String deleteOneStudent(@PathVariable("id") Long id){
        return studentService.deleteOneStudent(id);
    }
}
