package com.project.economyrural.demoeconomyrural.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//esto no es una clase es un clase que HEREDA
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class ModeloBase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cratedAt;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date upDateAt;

    @PrePersist
    protected void onCreate() {
        this.cratedAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.cratedAt = new Date();
    }
}
