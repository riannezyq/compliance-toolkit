package com.regulation.compliancetoolkit.service;

import com.regulation.compliancetoolkit.repository.StandardDocumentRepository;
import com.regulation.compliancetoolkit.entity.StandardDocument;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class StandardDocumentServiceImpl implements StandardDocumentService {

    private final StandardDocumentRepository documentRepository;

    public StandardDocumentServiceImpl(StandardDocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public Optional<StandardDocument> getDocumentByTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Document title cannot be empty");
        }
        return documentRepository.findByTitle(title);
    }

    @Override
    public StandardDocument saveDocument(StandardDocument document) {
        if (documentRepository.findByTitle(document.getTitle()).isPresent()) {
            throw new IllegalStateException("Document with title " + document.getTitle() + " already exists");
        }
        return documentRepository.save(document);
    }

    @Override
    public void deleteDocumentById(Long id) {
        if (!documentRepository.existsById(id)) {
            throw new IllegalArgumentException("Document with ID " + id + " does not exist");
        }
        documentRepository.deleteById(id);
    }
}