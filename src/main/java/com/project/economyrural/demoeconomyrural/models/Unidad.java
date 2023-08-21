package com.project.economyrural.demoeconomyrural.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "unidades")
@NoArgsConstructor
@Getter
@Setter
public class Unidad extends ModeloBase{

    @NotNull(message = "No debe ir vacío")
    @NotBlank
    @Size(min = 2, max = 45)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "El nombre solo debe contener caracteres alfabéticos")
    private String unidad;

    //relación de uno a muchos con la tabla de productos 
    @OneToMany(mappedBy="unidad", fetch = FetchType.LAZY)
    private List<Producto> productos;

}
