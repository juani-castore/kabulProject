package com.kabul.demo.Service;

import com.kabul.demo.Model.Skill;
import com.kabul.demo.Repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    @Autowired
    SkillRepository skillRepository;

    public Skill saveSkill(Skill skill){
        return skillRepository.save(skill);
    }

    public Optional<Skill> findSkillById(int id){
        return skillRepository.findById(id);
    }

    public List<Skill> listSkills(){
        return skillRepository.findAll();
    }
}
