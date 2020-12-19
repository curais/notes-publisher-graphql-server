package com.curais.notespublisher.resolver;

import com.curais.notespublisher.model.Note;
import com.curais.notespublisher.service.NoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class EntityMutationResolver implements GraphQLMutationResolver {
    
    @Autowired
    private NoteService service;

    public Note createNote(String name, String author, String noteContent) throws Exception {
        return service.create(new Note (name, author, noteContent));
    }
}
