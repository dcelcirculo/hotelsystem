package com.devsenior.hotelsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsenior.hotelsystem.model.Hotel;

// Se encarga de comunicarse con la base de datos y realizar operaciones CRUD sobre la tabla de hoteles. Extiende JpaRepository, lo que le permite heredar métodos para guardar, eliminar y buscar hoteles. Además, define métodos personalizados para buscar hoteles por ciudad, nombre y disponibilidad de habitaciones.
// Solo sabe guardar y consultar datos.

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByCiudad(String ciudad);

    List<Hotel> findByNombreContainingIgnoreCase(String nombre);

    @Query("SELECT h FROM Hotel h JOIN h.habitaciones hab WHERE hab.disponible = true")
    List<Hotel> findHotelesConHabitacionesDisponibles(); // en esta Lista se retornan todos los hoteles que tienen al
                                                         // menos una habitación disponible
}
