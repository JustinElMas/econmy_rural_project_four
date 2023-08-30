package com.project.economyrural.demoeconomyrural.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.economyrural.demoeconomyrural.models.Pregunta;
import com.project.economyrural.demoeconomyrural.models.Producto;
import com.project.economyrural.demoeconomyrural.repositories.PreguntaRepositorio;

@Service
public class PreguntaServicio extends ServicioBase<Pregunta> {

    private PreguntaRepositorio preguntaRepositorio;

    public PreguntaServicio(PreguntaRepositorio preguntaRepositorio) {
        super(preguntaRepositorio);
        this.preguntaRepositorio = preguntaRepositorio;
    }

    //¿ESTE MÉTODO ES EL CORRECTO PARA BUSCAR POR PRECIO?
    public List<Pregunta> findByProducto(Producto producto){
        return preguntaRepositorio.findByProducto(producto);
    }

    public Pregunta findByContenido(String contenido) {
        Optional<Pregunta> personaOptional = preguntaRepositorio.findByContenido(contenido);
        if(personaOptional.isPresent()) {
            return personaOptional.get();
        } else {
            return null;
        }
    }
    

}
