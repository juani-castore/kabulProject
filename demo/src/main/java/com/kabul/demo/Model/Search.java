package com.kabul.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "searches")
public class Search {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSearch")
    private int idSearch;

    @JsonIgnore
    @ManyToOne
    private Employer employer;

    @ManyToMany
    private Set<Skill> searchedSkills;

    public Search() {
    }

    public Search(int idSearch, Employer employer, Set<Skill> searchedSkills) {
        this.idSearch = idSearch;
        this.employer = employer;
        this.searchedSkills = searchedSkills;
    }

    public Search(Employer employer, Set<Skill> searchedSkills) {
        this.employer = employer;
        this.searchedSkills = searchedSkills;
    }

}
