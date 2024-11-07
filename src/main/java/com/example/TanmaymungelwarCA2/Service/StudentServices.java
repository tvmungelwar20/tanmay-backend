package com.example.TanmaymungelwarCA2.Service;


import com.example.TanmaymungelwarCA2.Entity.Student;
import com.example.TanmaymungelwarCA2.Report.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo repo;

    public void saveorUpdate(Student students) {

        repo.save(students);
    }

    public Iterable<Student> listAll() {

        return this.repo.findAll();

    }


    public void deleteStudent(String id) {

        repo.deleteById(id);
    }

    public Student getStudentByID(String studentid) {
        return repo.findById(studentid).get();
    }
}
