package com.kabul.demo.Controller;

import com.kabul.demo.Model.Employee;
import com.kabul.demo.Model.Employer;
import com.kabul.demo.Model.Search;
import com.kabul.demo.Service.EmployerService;
import com.kabul.demo.Service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employers")
public class EmployerController {

    @Autowired
    EmployerService employerService;

    @Autowired
    SearchService searchService;

    @PostMapping
    public Employer employerRegister(@RequestBody Employer employer){
        return employerService.saveEmployer(employer);
    }

    @PostMapping("/search/{id}")
    public List<Employee> newSearch(@RequestBody Search search, @PathVariable Integer id){
        return employerService.searchPost(search);
    }
}
