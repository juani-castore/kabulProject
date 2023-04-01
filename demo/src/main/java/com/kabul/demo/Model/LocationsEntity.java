package com.kabul.demo.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "locations", schema = "kabulUsers", catalog = "")
public class LocationsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idlocations")
    private int idlocations;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "city")
    private String city;

    public LocationsEntity() {
    }

    public LocationsEntity(String country, String state, String city) {
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public LocationsEntity(int idlocations, String country, String state, String city) {
        this.idlocations = idlocations;
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public int getIdlocations() {
        return idlocations;
    }

    public void setIdlocations(int idlocations) {
        this.idlocations = idlocations;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationsEntity that = (LocationsEntity) o;
        return idlocations == that.idlocations && Objects.equals(country, that.country) && Objects.equals(state, that.state) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idlocations, country, state, city);
    }
}
