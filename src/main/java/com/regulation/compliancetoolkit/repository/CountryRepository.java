package com.regulation.compliancetoolkit.repository;

import com.regulation.compliancetoolkit.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    // No code needed - JpaRepository has all basic CRUD methods
}