package com.anon.Springboot.demo.Service;

import com.anon.Springboot.demo.Entity.Student;
import com.anon.Springboot.demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudents() {
       return studentRepo.findAll();
    }


    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student findStudentById(long id) {
        return studentRepo.findById(id).get();
    }


    public Student findStudentByFirstName(String name) {
        return studentRepo.findByFirstName(name);
    }

    public String deleteStudentById(long id) {
        studentRepo.deleteById(id);
        return "Deleted student with id "+ id;
    }


    public Student updateStudent(Student student) {
        Student xstudent = studentRepo.findById(student.getId()).orElse(null);
        xstudent.setFirstName(student.getFirstName());
        xstudent.setLsatName(student.getLsatName());
        xstudent.setMobile(student.getMobile());
        studentRepo.save(xstudent);
        return xstudent;
    }
}
