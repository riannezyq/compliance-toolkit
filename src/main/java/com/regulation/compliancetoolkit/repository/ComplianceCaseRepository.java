package com.regulation.compliancetoolkit.repository;

import com.regulation.compliancetoolkit.entity.ComplianceCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplianceCaseRepository extends JpaRepository<ComplianceCase, Integer> {

}