package com.kabul.demo.Service;

import com.kabul.demo.Model.Employee;
import com.kabul.demo.Model.Employer;
import com.kabul.demo.Model.Search;
import com.kabul.demo.Model.Skill;
import com.kabul.demo.Repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployerService {

    @Autowired
    private EmployerRepository employerRepository;

    @Autowired
    private EmployeeService employeeService;

    public Employer saveEmployer(Employer employer){
        return employerRepository.save(employer);
    }

    public Optional<Employer> findEmployerbById(Integer idEmployer){
        return employerRepository.findById(idEmployer);
    }

    public List<Employee> searchPost(Search search) {
        List<Employee> res = new ArrayList<>();
        List<Employee> aux = employeeService.listEmployees();
        for (Employee e : aux){
            for (Skill s : search.getSearchedSkills()){
                for (Skill sk : e.getSkills()){
                    if (sk.getName().equals(s.getName()) && !res.contains(e)){
                        res.add(e);
                    }
                }
            }
        }
        return res;
    }
}
