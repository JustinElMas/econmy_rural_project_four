package com.project.economyrural.demoeconomyrural.repositories;

import com.project.economyrural.demoeconomyrural.models.Pregunta;
import com.project.economyrural.demoeconomyrural.models.Producto;

import java.util.List;
import java.util.Optional;


public interface PreguntaRepositorio extends RepositorioBase<Pregunta> {

    List<Pregunta> findByProducto(Producto producto);

    Optional<Pregunta> findByContenido(String contenido);
    
}

