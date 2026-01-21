package com.regulation.compliancetoolkit.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "standard_documents")
@Data
public class StandardDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;
    private String englishTitle;
    private String standardScope;
    private String replaceStandard;
    private LocalDate publishDate;
    private LocalDate implementDate;
    private String draftUnit;
    @Column(columnDefinition = "TEXT")
    private String content;
}