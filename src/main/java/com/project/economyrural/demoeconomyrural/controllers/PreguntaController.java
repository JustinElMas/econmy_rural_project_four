package com.project.economyrural.demoeconomyrural.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.economyrural.demoeconomyrural.models.Pregunta;
import com.project.economyrural.demoeconomyrural.services.PreguntaServicio;

import jakarta.validation.Valid;

@Controller
public class PreguntaController {

    @Autowired PreguntaServicio preguntaServicio;

    /* metodo para buscar página de detalles del producto */
    private String mostrarPagina(Model model) {
        List<Pregunta> preguntas = preguntaServicio.findAll();
        model.addAttribute("preguntas", preguntas);
        return "productos/detalles_producto";
    }

    @PostMapping("/productos")
    public String guardar(
        @Valid @ModelAttribute("pregunta") Pregunta pregunta,
        BindingResult result, 
        Model model
    ) {

        if(result.hasErrors()) {
            return mostrarPagina(model);
        }

        //guardar la pregunta 
        preguntaServicio.save(pregunta);

        return "redirect:/productos";
    }

}

