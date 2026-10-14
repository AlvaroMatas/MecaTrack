package com.mecatrack.api.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mecatrack.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);
    /* Spring lee el nombre del método y genera la consulta. findBy más Email equivale a SELECT ... WHERE email = ?. Devuelve Optional<Usuario>, que puede contener un usuario o estar vacío, así evitamos comprobar si el valor es null. */

    boolean existsByEmail(String email); //devuelve true o false según exista el email.
}