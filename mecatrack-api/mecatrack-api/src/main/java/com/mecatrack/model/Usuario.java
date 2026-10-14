package com.mecatrack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity //Le dice al JPA que la clase representa una tabla
@Table(name = "usuario") //Dice que la tabla se llama usuario en SQL
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //atributo de id

    @Column(nullable = false, unique = true, length = 150)
    private String email; //atributo email

    @Column(nullable = false, length = 255)
    private String password; //atributo password

    @Column(nullable = false, length = 100)
    private String nombre; //atributo nombre

    @Enumerated(EnumType.STRING) //indica que se guarda el nombre del valor como texto ("CLIENTE"). Si no se pusiera, guardaría un número.
    @Column(nullable = false, length = 20)
    private Rol rol; //atributo rol

    @Column(name = "fecha_alta", nullable = false)
    private LocalDateTime fechaAlta = LocalDateTime.now(); //atributo fecha de alta
    // LocalDateTime.now() da el valor inicial: la fecha y hora en que se crea el objeto.
    // LocalDateTime clase de Java que guarda una fecha y una hora juntas

    // Constructor vacío: lo usa JPA para crear el objeto al leer una fila
    public Usuario() {
    }

    // Constructor completo: lo usamos al crear un usuario nuevo desde el código
    public Usuario(String email, String password, String nombre, Rol rol) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    
}