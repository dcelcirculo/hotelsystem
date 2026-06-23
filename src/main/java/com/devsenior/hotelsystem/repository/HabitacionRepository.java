package com.devsenior.hotelsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsenior.hotelsystem.model.Habitacion;

public interface HabitacionRepository extends JpaRepository<Habitacion, Long> {

    List<Habitacion> findByHotelId(Long hotelId);

    List<Habitacion> findByDisponibleAndHotelId(Boolean disponible, Long hotelId);

    List<Habitacion> findByTipo(String tipo);

    @Query("SELECT h FROM Habitacion h WHERE h.precioNoche <= :precioMaximo")
    List<Habitacion> findByPrecioNocheMenorIgual(Double precioMaximo);
}
