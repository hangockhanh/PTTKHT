package com.example.librarymanagement.model;

import jakarta.persistence.*;

@Entity
public class CodeSnippet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String code;

    public CodeSnippet() {}

    public CodeSnippet(String title, String description, String code) {
        this.title = title;
        this.description = description;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
