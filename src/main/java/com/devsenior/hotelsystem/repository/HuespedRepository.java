package com.devsenior.hotelsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenior.hotelsystem.model.Huesped;

public interface HuespedRepository extends JpaRepository<Huesped, Long> {

    Optional<Huesped> findByEmail(String email);

    Optional<Huesped> findByDocumentoIdentidad(String documentoIdentidad);

    List<Huesped> findByNombreContainingIgnoreCaseOrApellidoContainingIgnoreCase(String nombre, String apellido);
}
