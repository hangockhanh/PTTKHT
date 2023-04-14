package com.example.librarymanagement.controller;

import com.example.librarymanagement.model.CodeSnippet;
import com.example.librarymanagement.repository.CodeSnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/code-snippets")
public class CodeSnippetController {

    @Autowired
    private CodeSnippetRepository repository;

    @GetMapping
    public List<CodeSnippet> getCodeSnippets() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CodeSnippet> getCodeSnippetById(@PathVariable Long id) {
        Optional<CodeSnippet> optionalCodeSnippet = repository.findById(id);
        if (optionalCodeSnippet.isPresent()) {
            return ResponseEntity.ok(optionalCodeSnippet.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public CodeSnippet createCodeSnippet(@RequestBody CodeSnippet codeSnippet) {
        return repository.save(codeSnippet);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CodeSnippet> updateCodeSnippet(@PathVariable Long id, @RequestBody CodeSnippet newCodeSnippet) {
        Optional<CodeSnippet> optionalCodeSnippet = repository.findById(id);
        if (optionalCodeSnippet.isPresent()) {
            CodeSnippet existingCodeSnippet = optionalCodeSnippet.get();
            existingCodeSnippet.setTitle(newCodeSnippet.getTitle());
            existingCodeSnippet.setDescription(newCodeSnippet.getDescription());
            existingCodeSnippet.setCode(newCodeSnippet.getCode());
            repository.save(existingCodeSnippet);
            return ResponseEntity.ok(existingCodeSnippet);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCodeSnippet(@PathVariable Long id) {
        Optional<CodeSnippet> optionalCodeSnippet = repository.findById(id);
        if (optionalCodeSnippet.isPresent()) {
            repository.delete(optionalCodeSnippet.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

