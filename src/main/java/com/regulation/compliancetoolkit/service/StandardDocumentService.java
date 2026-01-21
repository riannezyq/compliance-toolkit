package com.regulation.compliancetoolkit.service;

import java.util.Optional;
import com.regulation.compliancetoolkit.entity.StandardDocument;

public interface StandardDocumentService {
    // Get document by title
    Optional<StandardDocument> getDocumentByTitle(String title);

    // Save a new/updated document (for admin use later)
    StandardDocument saveDocument(StandardDocument document);

    // Optional: Delete a document (for admin use)
    void deleteDocumentById(Long id);
}
