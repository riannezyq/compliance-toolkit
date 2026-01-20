package com.regulation.compliancetoolkit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "countries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country_name", nullable = false)
    private String countryName;

    @Column(name = "country_cn_name", nullable = false)
    private String countryCnName;

    @Column(name = "sort_num")
    private Integer sortNum;
}