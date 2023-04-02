package com.kabul.demo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "employers")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmployer")
    private int idEmployer;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="employer")
    private Set<Search> searches = new HashSet<>();

    public Employer() {
    }

    public Employer(int idEmployer, String name, Set<Search> searches) {
        this.idEmployer = idEmployer;
        this.name = name;
        this.searches = searches;
    }

    public Employer(String name, Set<Search> searches) {
        this.name = name;
        this.searches = searches;
    }


}
