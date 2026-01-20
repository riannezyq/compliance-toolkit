package com.regulation.compliancetoolkit.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "regulation_data")
public class RegulationData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "country_name", nullable = false, unique = true)
    private String country; // 字段名直接叫country，和Vue的row.country完全匹配

    @Column(nullable = false)
    private Integer cat1;

    @Column(nullable = false)
    private Integer cat2;

    @Column(nullable = false)
    private Integer cat3;

    @Column(nullable = false)
    private Integer cat4;

    @Column(nullable = false)
    private Integer cat5;

    @Column(nullable = false)
    private Integer cat6;

    @Column(nullable = false)
    private Integer cat7;
}