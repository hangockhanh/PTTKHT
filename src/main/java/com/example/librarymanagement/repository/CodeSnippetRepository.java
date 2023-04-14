package com.example.librarymanagement.repository;

import com.example.librarymanagement.model.CodeSnippet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeSnippetRepository extends JpaRepository<CodeSnippet, Long> {
}
