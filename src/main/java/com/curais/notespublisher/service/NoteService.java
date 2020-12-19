package com.curais.notespublisher.service;

import com.curais.notespublisher.model.Note;
import com.curais.notespublisher.repository.NoteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService implements CreateReadService<Note, Long>{

    @Autowired
    NoteRepository repository;

    @Override
    public Note create(Note t) { return repository.save(t); }
    
    @Override
    //Returning null by the moment
    //TODO a more appropiate handler for not found cases
    public Note getOne(Long id) { return repository.findById(id).orElse(null); }

    @Override
    public Iterable<Note> getAll() { return repository.findAll(); }
}