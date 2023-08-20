package com.project.economyrural.demoeconomyrural.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    @GetMapping("")
    public String detallesDelProducto() {
        return "detalles_producto";
    }

}
