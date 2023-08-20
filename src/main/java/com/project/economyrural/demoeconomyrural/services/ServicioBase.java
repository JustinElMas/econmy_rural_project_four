package com.project.economyrural.demoeconomyrural.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.economyrural.demoeconomyrural.repositories.RepositorioBase;

@Service
public abstract class ServicioBase<T> {
    
    private RepositorioBase<T> repositoryBase;

    public ServicioBase(RepositorioBase<T> repositoryBase) {
        this.repositoryBase = repositoryBase;
    }

    public List<T> findAll() {
        return repositoryBase.findAll();
    }

    public T save(T objeto) {
        return repositoryBase.save(objeto);
    }
    
    public T findById(Long id) {
        Optional<T> optional = repositoryBase.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    public T update(T objeto) {
        return save(objeto);
    }

    /* public T delete(T objeto) {
        this.repositoryBase.delete(objeto);
        return objeto;
    } */

    public void delete(Long id) {
        repositoryBase.deleteById(id);
    }

}
