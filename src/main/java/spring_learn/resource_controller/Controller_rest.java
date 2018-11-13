package spring_learn.resource_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring_learn.Repository.studentrepository;
import spring_learn.entity.student;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:9090")
public class Controller_rest {

    @Autowired
    private studentrepository studentrepo;

    @PostMapping("/addStudent")
    public List<student> addstudent(@RequestBody student studentobj)
    {
        System.out.println(studentobj.getStudentname());
        studentrepo.save(studentobj);
        return studentrepo.findAll();
    }

    @GetMapping("/student/{id}")
    public student getStudent(@PathVariable("id") int id)
    {
       Optional<student> student= studentrepo.findById(id);
       if(!student.isPresent())
           throw new studnetnotfoundexception("for Id :"+id);
       else return student.get();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    private class studnetnotfoundexception extends RuntimeException
    {
        public studnetnotfoundexception(String s) {
            super(s);
        }
    }
}
