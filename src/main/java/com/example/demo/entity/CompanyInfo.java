package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "companyinfo")
public class CompanyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    @Column(name = "company_name", nullable = false, length = 100)
    private String companyName;

    @Column(name = "company_introduction")
    private String companyIntroduction;

    // Getters and Setters
}

