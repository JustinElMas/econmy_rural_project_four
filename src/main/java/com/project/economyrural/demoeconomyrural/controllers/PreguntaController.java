package com.project.economyrural.demoeconomyrural.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    /* buscar pregunta por contenido */
    @GetMapping("/buscar") 
    public String buscar(
        @ModelAttribute("pregunta") Pregunta pregunta,
        @RequestParam("txtBuscar") String buscarContenido,
        Model model
    ) {
        //comprobar que el contenido está presente
        pregunta = preguntaServicio.findByContenido(buscarContenido);

        if(pregunta != null) {
            model.addAttribute("preguntaResult", pregunta);
        } else {
            model.addAttribute("errorAtFindContentQuestion", "No se puede encontrar el contenido");
        }


        return "productos/respuestasAPreguntas";
    }

    /* eliminar una pregunta */
    @GetMapping("/productos/{id}/delete")
    public String delete(@PathVariable Long id) {
        preguntaServicio.delete(id);
        return "redirect:/productos";
    }

    /* responder una pregunta */
    @GetMapping("/productos/{id}/edit")
    public String responderPregunta(
        @PathVariable("id") Long id,
        Model model
    ) {
        Pregunta pregunta = preguntaServicio.findById(id);
        model.addAttribute("pregunta", pregunta);
        return "productos/editPreguntas";
    }

    @RequestMapping(value="{id}", method=RequestMethod.PUT)
    public String actualizarPregunta(
        @Valid @ModelAttribute("pregunta") Pregunta pregunta,
        Model model, 
        BindingResult result
    ) {
        if(result.hasErrors()) {
            model.addAttribute("errorAlEditarPregunta", "Ocurrió un error intentálo de nuevo");
            return "productos/editPreguntas";
        } 

        preguntaServicio.save(pregunta);

        return "redirect:/productos";
    }

    /* 
     * LO QUE SE ME OCURRE COMO ALGORITMO:
     * 1. Hacer que la vista muestre la parte de responder
     * 2. El botón del form que se habilita dentro de la pregunta debe tener el method post como edit en el controller para responder a esa pregunta (id)
     * 3. Recibir esa actualización de edición (respuesta nueva) de esa pregunta (POST MAPPING)
     * 4. Mostrar la pregunta actualzada en la vista
     */

}

