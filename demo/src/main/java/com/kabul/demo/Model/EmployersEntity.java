package com.kabul.demo.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "employers", schema = "kabulUsers", catalog = "")
public class EmployersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idemployers")
    private int idemployers;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "users_idusers")
    private int usersIdusers;

    public EmployersEntity(int idemployers, String name, int usersIdusers) {
        this.idemployers = idemployers;
        this.name = name;
        this.usersIdusers = usersIdusers;
    }

    public EmployersEntity(String name, int usersIdusers) {
        this.name = name;
        this.usersIdusers = usersIdusers;
    }

    public EmployersEntity() {
    }

    public int getIdemployers() {
        return idemployers;
    }

    public void setIdemployers(int idemployers) {
        this.idemployers = idemployers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        EmployersEntity that = (EmployersEntity) o;
        return idemployers == that.idemployers && usersIdusers == that.usersIdusers && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idemployers, name, usersIdusers);
    }
}
