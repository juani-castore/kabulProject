package com.kabul.demo.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users", schema = "kabulUsers", catalog = "")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idusers")
    private int idusers;
    @Basic
    @Column(name = "userName")
    private String userName;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "zipCode")
    private String zipCode;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "locations_idlocations")
    private int locationsIdlocations;

    public UsersEntity() {
    }

    public UsersEntity(int idusers, String userName, String password, String zipCode, String email, int locationsIdlocations) {
        this.idusers = idusers;
        this.userName = userName;
        this.password = password;
        this.zipCode = zipCode;
        this.email = email;
        this.locationsIdlocations = locationsIdlocations;
    }

    public UsersEntity(String userName, String password, String zipCode, String email, int locationsIdlocations) {
        this.userName = userName;
        this.password = password;
        this.zipCode = zipCode;
        this.email = email;
        this.locationsIdlocations = locationsIdlocations;
    }

    public int getIdusers() {
        return idusers;
    }

    public void setIdusers(int idusers) {
        this.idusers = idusers;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLocationsIdlocations() {
        return locationsIdlocations;
    }

    public void setLocationsIdlocations(int locationsIdlocations) {
        this.locationsIdlocations = locationsIdlocations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return idusers == that.idusers && locationsIdlocations == that.locationsIdlocations && Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(zipCode, that.zipCode) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idusers, userName, password, zipCode, email, locationsIdlocations);
    }
}
