package com.curais.notespublisher.service;

import com.curais.notespublisher.exceptions.DataNotFoundException;
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
    public Note getOne(Long id) throws DataNotFoundException {
        return repository.findById(id).orElseThrow(() -> new DataNotFoundException("Requested note of id {" + id + "} not present on DB")); 
    }

    @Override
    public Iterable<Note> getAll() { return repository.findAll(); }
}