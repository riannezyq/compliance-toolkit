package com.regulation.compliancetoolkit.controller;

import com.regulation.compliancetoolkit.entity.ComplianceCase;
import com.regulation.compliancetoolkit.service.CaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin; // ✅ Add this import


@CrossOrigin(origins = "http://localhost:5173") // ✅ Allow Vue's origin
@RestController
@RequestMapping("/api/case/") // All case list APIs start with this URL
@RequiredArgsConstructor
public class CaseController {

    private final CaseService caseService;

    // API 1: Get paginated cases → http://localhost:8080/api/case/list?page=0&size=10
    @GetMapping("/list")
    public ResponseEntity<Page<ComplianceCase>> getCaseList(
            @RequestParam(defaultValue = "0") int page, // Vue pagination page number (starts at 0)
            @RequestParam(defaultValue = "10") int size) { // 10 cases per page
        return ResponseEntity.ok(caseService.getPaginatedCases(page, size));
    }

    // API2: Get total case count → http://localhost:8080/api/case/total
    @GetMapping("/total")
    public ResponseEntity<Long> getTotalCases() {
        return ResponseEntity.ok(caseService.getTotalCases());
    }
}