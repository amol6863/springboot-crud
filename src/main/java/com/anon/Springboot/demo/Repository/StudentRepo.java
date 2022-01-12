package com.anon.Springboot.demo.Repository;

import com.anon.Springboot.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{


   public Student findByFirstName(String name);
}
