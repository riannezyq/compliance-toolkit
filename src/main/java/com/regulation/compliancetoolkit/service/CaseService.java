package com.regulation.compliancetoolkit.service;

import com.regulation.compliancetoolkit.entity.ComplianceCase;
import com.regulation.compliancetoolkit.repository.ComplianceCaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CaseService {

    private ComplianceCaseRepository caseRepo;

    public Page<ComplianceCase> getPaginatedCases(int page, int size) {
        int zeroBasedPage = Math.max(page - 1, 0); // Prevent negative page numbers
        Pageable pageable = PageRequest.of(zeroBasedPage, size);
        return caseRepo.findAll(pageable);
    }

    public long getTotalCases() {
        return caseRepo.count();
    }
}