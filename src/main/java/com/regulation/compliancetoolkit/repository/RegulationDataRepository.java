package com.regulation.compliancetoolkit.repository;

import com.regulation.compliancetoolkit.entity.RegulationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegulationDataRepository extends JpaRepository<RegulationData, Integer> {
}