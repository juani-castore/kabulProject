package com.kabul.demo.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "employees", schema = "kabulUsers", catalog = "")
public class EmployeesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idemployees")
    private int idemployees;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "surName")
    private String surName;
    @Basic
    @Column(name = "idAptitude")
    private int idAptitude;
    @Basic
    @Column(name = "users_idusers")
    private int usersIdusers;

    public EmployeesEntity() {
    }

    public EmployeesEntity(String name, String surName, int idAptitude, int usersIdusers) {
        this.name = name;
        this.surName = surName;
        this.idAptitude = idAptitude;
        this.usersIdusers = usersIdusers;
    }

    public EmployeesEntity(int idemployees, String name, String surName, int idAptitude, int usersIdusers) {
        this.idemployees = idemployees;
        this.name = name;
        this.surName = surName;
        this.idAptitude = idAptitude;
        this.usersIdusers = usersIdusers;
    }

    public int getIdemployees() {
        return idemployees;
    }

    public void setIdemployees(int idemployees) {
        this.idemployees = idemployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getIdAptitude() {
        return idAptitude;
    }

    public void setIdAptitude(int idAptitude) {
        this.idAptitude = idAptitude;
    }

    public int getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(int usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesEntity that = (EmployeesEntity) o;
        return idemployees == that.idemployees && idAptitude == that.idAptitude && usersIdusers == that.usersIdusers && Objects.equals(name, that.name) && Objects.equals(surName, that.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idemployees, name, surName, idAptitude, usersIdusers);
    }
}
