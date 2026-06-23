package com.devsenior.hotelsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenior.hotelsystem.model.Servicio;
import java.util.List;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {

    List<Servicio> findByDisponible(Boolean disponible);

    List<Servicio> findByNombreContainingIgnoreCase(String nombre);

}
