package com.mecatrack.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "vehiculos")
public class Vehiculo {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 10)
    private String matricula;

    @Column(nullable = false, length = 50)
    private String marca;

    @Column(nullable = false, length = 50)
    private String modelo;

    @Column(nullable = false)
    private int anio;

    @Column(nullable = false)
    private int kilometros;

    @ManyToOne(fetch = FetchType.LAZY, optional = false) //Expresa que muchos vehículos pueden pertenecer a un mismo usuario
    @JoinColumn(name = "usuario_id", nullable = false) //indica el nombre exacto de la columna que guarda la relación
    private Usuario usuario;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String marca, String modelo, int anio, int kilometros, Usuario usuario) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometros = kilometros;
        this.usuario = usuario;
    }

    
}
