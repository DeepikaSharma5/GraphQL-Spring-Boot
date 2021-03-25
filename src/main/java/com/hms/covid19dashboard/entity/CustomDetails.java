package com.hms.covid19dashboard.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "custom_details")
public class CustomDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "country")
    private String country;

    @Column(name = "new_cases")
    private int new_cases;

    @Column(name = "total_deaths")
    private int total_deaths;

    @Column(name = "total_recovered")
    private int total_recovered;

    public CustomDetails() {
    }

    public CustomDetails(String email, String country, int new_cases, int total_deaths, int total_recovered) {
        this.email = email;
        this.country = country;
        this.new_cases = new_cases;
        this.total_deaths = total_deaths;
        this.total_recovered = total_recovered;
    }

}
