package com.project.economyrural.demoeconomyrural.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.economyrural.demoeconomyrural.models.Producto;
import com.project.economyrural.demoeconomyrural.repositories.ProductoRepositorio;

@Service
public class ProdutoServicio extends ServicioBase<Producto>{

    private ProductoRepositorio productoRepositorio;

    public ProdutoServicio(ProductoRepositorio productoRepositorio) {
        super(productoRepositorio);
        this.productoRepositorio = productoRepositorio;
    }

    //¿ESTE MÉTODO ES EL CORRECTO PARA BUSCAR POR PRECIO?
    public List<Producto> findByPrecio(int precio){
        return productoRepositorio.findByPrecio(precio);
    }
    
}
