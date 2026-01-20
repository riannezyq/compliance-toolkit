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

    private final ComplianceCaseRepository caseRepo;


    // Get paginated case list (matches your Vue pagination)
    public Page<ComplianceCase> getPaginatedCases(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return caseRepo.findAll(pageable);
    }

    // Get total number of cases (for your Vue pagination count: 6074)
    public long getTotalCases() {
        return caseRepo.count();
    }
}