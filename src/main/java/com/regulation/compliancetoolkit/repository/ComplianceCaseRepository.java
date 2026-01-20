package com.regulation.compliancetoolkit.repository;

import com.regulation.compliancetoolkit.entity.ComplianceCase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplianceCaseRepository extends JpaRepository<ComplianceCase, Integer> {
    // Pagination for case list (critical for your 6074+ cases)
    Page<ComplianceCase> findAll(Pageable pageable);
}