package com.regulation.compliancetoolkit.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "compliance_cases")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplianceCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_id")
    private Integer caseId;

    @Column(name = "case_title_cn", nullable = false)
    private String caseTitleCn;

    @Column(name = "case_title_en", nullable = false)
    private String caseTitleEn;

    @Column(name = "standard_field", nullable = false)
    private String standardField;

    @Column(name = "replace_standard_no", nullable = false)
    private String replaceStandardNo;

    @Column(name = "publish_date", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd") // Add this
    private LocalDate publishDate;

    @Column(name = "implement_date", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd") // Add this
    private LocalDate implementDate;

    @Column(name = "drafting_company", nullable = false)
    private String draftingCompany;

    @Column(name = "star_count")
    private Integer starCount = 0;

    @Column(name = "is_collected")
    private Boolean isCollected = false;
}


