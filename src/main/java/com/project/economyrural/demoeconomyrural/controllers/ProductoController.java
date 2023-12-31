package com.project.economyrural.demoeconomyrural.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.economyrural.demoeconomyrural.models.Pregunta;
import com.project.economyrural.demoeconomyrural.services.PreguntaServicio;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    @Autowired PreguntaServicio preguntaServicio;

    @GetMapping("")
    public String detallesDelProducto(Model model, @ModelAttribute("pregunta") Pregunta pregunta) {
        return mostrarPagina(model);
    }

    /* metodo para buscar página de detalles del producto */
    private String mostrarPagina(Model model) {
        List<Pregunta> preguntas = preguntaServicio.findAll();
        model.addAttribute("preguntas", preguntas);
        return "productos/detalles_producto";
    }

    /* agregar un producto nuevo */


    /* ver detalles del producto por id */


    /* hacer un put al producto al guardarlo con una nueva pregunta */
}
