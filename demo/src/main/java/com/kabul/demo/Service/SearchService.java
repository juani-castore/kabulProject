package com.kabul.demo.Service;

import com.kabul.demo.Model.Employer;
import com.kabul.demo.Model.Search;
import com.kabul.demo.Repository.EmployerRepository;
import com.kabul.demo.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SearchService {

    @Autowired
    SearchRepository searchRepository;

    @Autowired
    EmployerRepository employerRepository;


    public Optional<Search> findSearchById(int id){
        return searchRepository.findById(id);
    }

    public List<Search> findSearchesByEmployerId(int id){
        List<Search> res = searchRepository.findAll();
        for (Search s : res){
            if (s.getEmployer().getIdEmployer() != id){
                res.remove(s);
            }
        }
        return res;
    }

}
