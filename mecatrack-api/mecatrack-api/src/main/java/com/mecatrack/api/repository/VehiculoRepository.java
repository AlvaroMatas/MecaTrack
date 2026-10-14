package com.mecatrack.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mecatrack.api.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

    List<Vehiculo> findByUsuarioId(Long usuarioId); 
    /* aquí Usuario es el atributo de Vehiculo y Id su campo. Spring entiende que debe buscar por usuario.id, es decir, por la columna usuario_id. Devuelve una lista porque un cliente puede tener varios coches. */

    Optional<Vehiculo> findByMatricula(String matricula);

    boolean existsByMatricula(String matricula); //Devuelve true o false si existe la matricula o no
}