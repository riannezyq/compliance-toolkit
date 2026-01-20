package com.regulation.compliancetoolkit.repository;

import com.regulation.compliancetoolkit.entity.CountryRegulationStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CountryRegulationStatsRepository extends JpaRepository<CountryRegulationStats, Integer> {
    // Custom query: get all stats for regulation comparison table
    List<CountryRegulationStats> findAll();
}