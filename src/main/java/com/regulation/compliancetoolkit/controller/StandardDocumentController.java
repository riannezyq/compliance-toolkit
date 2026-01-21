package com.regulation.compliancetoolkit.controller;

import com.regulation.compliancetoolkit.entity.StandardDocument;
import com.regulation.compliancetoolkit.service.StandardDocumentService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/standards")
public class StandardDocumentController {
    private final StandardDocumentService documentService;
    private final Path fileStorageLocation = Paths.get("uploads/standards").toAbsolutePath().normalize();

    public StandardDocumentController(StandardDocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/{title}")
    public ResponseEntity<StandardDocument> getStandardByTitle(@PathVariable String title) {
        return documentService.getDocumentByTitle(title)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/download/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) {
        try {
            Path filePath = fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION,
                                "attachment; filename=\"" + resource.getFilename() + "\"")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}