package com.curais.notespublisher.service;

public interface CreateReadService<T, ID> {
    T create(T t);
    T getOne(ID id);
    //TODO add query options mechanism
    Iterable<T> getAll();
}