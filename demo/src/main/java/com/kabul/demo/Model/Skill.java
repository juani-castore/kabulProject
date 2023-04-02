package com.kabul.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSkill")
    private int idSkill;

    private String name;

    @JsonIgnore
    @ManyToMany
    private Set<Search> skillInSearches;

    @JsonIgnore
    @ManyToMany
    private Set<Employee> skilledEmployees;

    public Skill() {
    }


    public Skill(String name, Set<Search> skillInSearches, Set<Employee> skilledEmployees) {
        this.name = name;
        this.skillInSearches = skillInSearches;
        this.skilledEmployees = skilledEmployees;
    }

    public Skill(int idSkill, String name, Set<Search> skillInSearches, Set<Employee> skilledEmployees) {
        this.idSkill = idSkill;
        this.name = name;
        this.skillInSearches = skillInSearches;
        this.skilledEmployees = skilledEmployees;
    }
}
