package com.project.economyrural.demoeconomyrural.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Getter
@Setter
@NoArgsConstructor
public class Producto extends ModeloBase {
    
    @NotNull(message = "Debes añadir un titulo a este producto")
    @Size(min = 4, max = 100, message = "Este campo permite una logintud de 4 a 100 caracteres")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "El campo de red de TV solo debe contener caracteres alfabéticos")
    private String titulo;

    @NotBlank(message = "La descripción del canal no debe ir en blanco")
    @Size(max = 5000, message = "Las descripciones no pueden tener más de 5000 caracteres")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "El campo de red de TV solo debe contener caracteres alfabéticos")
    private String descripcion;    

    //¿y la imagen, si va en esta tabla para guardar en la base de datos?
    @Null(message = "El campo imagen puede estar vacío o contener solo caracteres alfabéticos")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "El campo imagen solo debe contener caracteres alfabéticos")
    private String imagen;

    private int rating;

    @DecimalMin(value = "3", inclusive = true, message = "El precio mínimo es 3")
    @DecimalMax(value = "1000000", inclusive = true, message = "El precio máximo es 1000000")
    private float precio;
    //debajo de este comentatio va la relación de uno a muchos con la tabla de ratings 

}
