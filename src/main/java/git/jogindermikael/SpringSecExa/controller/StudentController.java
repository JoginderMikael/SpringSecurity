package git.jogindermikael.SpringSecExa.controller;


import git.jogindermikael.SpringSecExa.model.Student;
import git.jogindermikael.SpringSecExa.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


//    private List<Student> students = new ArrayList<>(List.of(new Student(1, "Joginder", 90),
//    new Student(2, "Mikael", 89)
//    ));

    @Autowired
    StudentService studentService;


    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentService.getAllStudents();
}

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
}
}
