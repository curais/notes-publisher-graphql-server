package com.curais.notespublisher.resolver;

import java.util.HashMap;
import java.util.Map;

import com.curais.notespublisher.exceptions.DataNotFoundException;
import com.curais.notespublisher.model.Note;
import com.curais.notespublisher.service.NoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class EntityQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private NoteService service;

    public Note getOneNote(Long id) throws DataNotFoundException {
        return service.getOne(id);
    }

    public Iterable<Note> getAllNotes() {
        return service.getAll();
    }

    @ExceptionHandler(value = DataNotFoundException.class)
    public GraphQLError toCustomError(DataNotFoundException e) {
        Map<String, Object> extensions = new HashMap<>();
        extensions.put("reason", e.getReason());
        return GraphqlErrorBuilder.newError().message(e.getMessage()).extensions(extensions).build();
    }
}
