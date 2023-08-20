package com.project.economyrural.demoeconomyrural.repositories;

import com.project.economyrural.demoeconomyrural.models.Producto;
import java.util.List;


public interface ProductoRepositorio extends RepositorioBase<Producto> {
    
    List<Producto> findByPrecio(float precio);

}
