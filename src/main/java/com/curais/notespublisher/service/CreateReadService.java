package com.curais.notespublisher.service;

import com.curais.notespublisher.exceptions.DataNotFoundException;

public interface CreateReadService<T, ID> {
    T create(T t);
    T getOne(ID id) throws DataNotFoundException;
    //TODO add query options mechanism
    Iterable<T> getAll();
}