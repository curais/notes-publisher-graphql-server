package com.curais.notespublisher.repository;

import com.curais.notespublisher.model.Note;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long>{
    
}
