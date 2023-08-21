package com.project.economyrural.demoeconomyrural.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
public class Usuario extends ModeloBase {
    
    @NotNull(message = "No debe ir vacío")
    @NotBlank
    @Size(min = 2, max = 20)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "El nombre solo debe contener caracteres alfabéticos")
    private String nombre;

    @NotNull(message = "No debe ir vacío")
    @NotBlank
    @Size(min = 2, max = 20)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "El nombre solo debe contener caracteres alfabéticos")
    private String apellido;


    @NotNull(message = "No debe ir vacío")
    @NotBlank
    @Pattern(regexp = ".*@.*\\..*", message = "Necesitas ingresar un correo electrónico válido")
    @Email
    private String email;

    @NotNull(message = "No debe ir vacío")
    @NotBlank(message = "La contraseña no puede estar en blanco")
    public String password;

    //Transient para confirmar la contraseña
    @Transient
    @NotBlank(message = "Confirma tu contraseña")
    private String passwordConfirmation;

    private RolEnum rol;

    public enum RolEnum {
        COMPRADOR, 
        VENDEDOR
    }
    
    private String numeroDeCelular;

    //relación de uno a uno
    @OneToOne(mappedBy="usuario", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Rating rating;
}
