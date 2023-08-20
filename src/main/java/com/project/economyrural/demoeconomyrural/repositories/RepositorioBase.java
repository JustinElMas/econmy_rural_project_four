package com.project.economyrural.demoeconomyrural.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

//se le agrega esta anotación porque va a heredad 
@NoRepositoryBean
public interface RepositorioBase<T> extends CrudRepository<T, Long> {
    
    List<T> findAll();

}
