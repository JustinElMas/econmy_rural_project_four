package com.project.economyrural.demoeconomyrural.repositories;

import com.project.economyrural.demoeconomyrural.models.Pregunta;
import com.project.economyrural.demoeconomyrural.models.Producto;

import java.util.List;


public interface PreguntaRepositorio extends RepositorioBase<Pregunta> {

    List<Pregunta> findByProducto(Producto producto);
    
}

