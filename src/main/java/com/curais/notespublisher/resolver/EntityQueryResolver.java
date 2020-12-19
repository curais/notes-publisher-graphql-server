package com.curais.notespublisher.resolver;

import com.curais.notespublisher.model.Note;
import com.curais.notespublisher.service.NoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class EntityQueryResolver implements GraphQLQueryResolver {
    
    @Autowired
    private NoteService service;

    public Note getOneNote(Long id){
        return service.getOne(id);
    }

    public Iterable<Note> getAllNotes() {
        return service.getAll();
    }
}
