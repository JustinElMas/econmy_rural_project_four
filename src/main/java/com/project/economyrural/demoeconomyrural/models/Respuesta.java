package com.project.economyrural.demoeconomyrural.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "respuestas")
@NoArgsConstructor
@Getter
@Setter
public class Respuesta extends ModeloBase{
    
    @NotBlank(message = "El contenido del producto no debe ir en blanco")
    @Size(max = 5000, message = "El contenido no pueden tener más de 5000 caracteres")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "El campo contenido solo debe contener caracteres alfabéticos")
    private String contenido; 

    //debajo de este comentario va la relación de muchos a uno con la tabla categorias 
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pregunta_id")
    private Pregunta pregunta;

    //debajo de este comentario va la relación de muchos a uno con la tabla categorias 
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

}
