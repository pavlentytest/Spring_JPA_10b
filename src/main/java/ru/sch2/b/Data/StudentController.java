package ru.sch2.b.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentAction studentAction;

    @GetMapping("/list")
    public @ResponseBody Iterable<Student> getAllStudents() {
        return studentAction.findAll();
    }

    @GetMapping("/add")
    public @ResponseBody  String addNewStudent(@RequestParam String name, @RequestParam String email, @RequestParam Integer age, @RequestParam String city) {
        Student s = new Student();
        s.setAge(age);
        s.setEmail(email);
        s.setCity(city);
        s.setName(name);
        studentAction.save(s);
        return "Saved!!!";
    }
}
