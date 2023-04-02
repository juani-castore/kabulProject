package com.kabul.demo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmployee")
    private int idEmployee;

    @Column(name = "name")
    private String name;

    @Column(name = "surName")
    private String surName;

    @ManyToMany
    private Set<Skill> skills;

    public Employee() {
    }

    public Employee(int idEmployee, String name, String surName, Set<Skill> skills) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.surName = surName;
        this.skills = skills;
    }

    public Employee(String name, String surName, Set<Skill> skills) {
        this.name = name;
        this.surName = surName;
        this.skills = skills;
    }
}
