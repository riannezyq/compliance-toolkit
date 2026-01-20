package com.regulation.compliancetoolkit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "country_regulation_stats")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryRegulationStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stats_id")
    private Integer statsId;

    @Column(name = "country_id", nullable = false)
    private Integer countryId;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    @Column(name = "stats_value", nullable = false)
    private Integer statsValue;

    @Column(name = "is_highlight")
    private Boolean isHighlight = false; // 1=highlight,0=normal (Spain 156)
}