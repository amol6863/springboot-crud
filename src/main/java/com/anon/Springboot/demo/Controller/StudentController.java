package com.anon.Springboot.demo.Controller;

import com.anon.Springboot.demo.Entity.Student;
import com.anon.Springboot.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
     private StudentService studentService;

    @GetMapping("/greetings")
    public string greetings(){
        return "Welcome ..!";
    }

    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable("id") long id){
        return studentService.findStudentById(id);
    }

    @GetMapping("/student/name/{name}")
    public Student findStudentByFirstName(@PathVariable String name){
        return studentService.findStudentByFirstName(name);
    }

    @PostMapping("/student/{id}")
    public String deleteStudentById(@PathVariable("id") long id){
        return studentService.deleteStudentById(id);
    }

    @PutMapping("/student/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
}
