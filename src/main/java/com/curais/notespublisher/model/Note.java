package com.curais.notespublisher.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String name;
    
    @NotEmpty
    private String author;

    @NotNull
    private String noteContent;

    public Note() {
    }
    
    public Note(@NotEmpty String name, @NotEmpty String author, @NotNull String noteContent) {
		this.name = name;
		this.author = author;
		this.noteContent = noteContent;
	}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
} 