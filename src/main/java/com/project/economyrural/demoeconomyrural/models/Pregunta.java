package com.project.economyrural.demoeconomyrural.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "preguntas")
@NoArgsConstructor
@Getter
@Setter
public class Pregunta extends ModeloBase{
    
    @NotBlank(message = "El contenido del producto no debe ir en blanco")
    @Size(min = 10, max = 5000, message = "El contenido debe ser más de 10 caracteres y no pueden tener más de 5000 caracteres")
    @Pattern(regexp = "^(?=.*[\\p{L}\\p{M}\\s¿?])[\\p{L}\\p{M}\\s¿?]*[¿?]$", message = "El campo contenido debe ser una pregunta")
    private String contenido; 

    //debajo de este comentario va la relación de muchos a uno con la tabla categorias 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="producto_id")
    private Producto producto;

    //debajo de este comentario va la relación de muchos a uno con la tabla categorias 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    //relacion de uno a uno con la tabla de respuestas
    @OneToOne(mappedBy="pregunta", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Respuesta respuesta;
}
