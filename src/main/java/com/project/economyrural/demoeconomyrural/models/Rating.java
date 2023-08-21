package com.project.economyrural.demoeconomyrural.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ratings")
@Getter
@Setter
@NoArgsConstructor
public class Rating extends ModeloBase {

    private int estrellas;
    
    //relación de uno a uno con la tabla usuario
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    //relación de muchos a uno con la tabla de producto
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="producto_id")
    private Producto producto;


}
