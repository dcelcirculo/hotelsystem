package com.devsenior.hotelsystem.service;

import java.util.List;
import java.util.Optional;

import com.devsenior.hotelsystem.model.Hotel;

public interface HotelService {

    List<Hotel> listarTodos();

    Optional<Hotel> buscarPorId(Long id);

    List<Hotel> buscarPorCiudad(String ciudad);

    Hotel crear(Hotel hotel);

    Hotel actualizar(Long id, Hotel hotel);

    void eliminar(Long id);

    List<Hotel> buscarConHabitacionesDisponibles();

}
