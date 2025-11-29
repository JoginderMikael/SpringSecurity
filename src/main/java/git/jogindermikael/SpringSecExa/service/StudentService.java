package git.jogindermikael.SpringSecExa.service;

import git.jogindermikael.SpringSecExa.model.Student;
import git.jogindermikael.SpringSecExa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> getAllStudents() {
        return new ArrayList<>(repo.findAll());
    }

    public Student addStudent(Student student) {
        return repo.save(student);
    }
}
