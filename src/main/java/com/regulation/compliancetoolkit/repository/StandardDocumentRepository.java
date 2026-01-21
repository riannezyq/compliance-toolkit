package com.regulation.compliancetoolkit.repository;

import com.regulation.compliancetoolkit.entity.StandardDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StandardDocumentRepository extends JpaRepository<StandardDocument, Long> {
    Optional<StandardDocument> findByTitle(String title);
}