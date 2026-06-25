package com.devsenior.hotelsystem.service;

import java.util.List;
import java.util.Optional;

import com.devsenior.hotelsystem.model.Hotel;

// Es una interfaz. Se define que puede hacer el servicio. Solo se escriben las firmas de los metodos, no se implementan.

public interface HotelService {

    List<Hotel> listarTodos();

    Optional<Hotel> buscarPorId(Long id);

    List<Hotel> buscarPorCiudad(String ciudad);

    Hotel crear(Hotel hotel);

    Hotel actualizar(Long id, Hotel hotel);

    void eliminar(Long id);

    List<Hotel> buscarConHabitacionesDisponibles();

}
