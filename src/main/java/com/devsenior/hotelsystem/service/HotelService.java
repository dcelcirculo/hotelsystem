package com.devsenior.hotelsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devsenior.hotelsystem.model.Hotel;
import com.devsenior.hotelsystem.repository.HotelRepository;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository hotelRepository;

    List<Hotel> listarTodos() {
        // TODO: Implementar lógica para listar todos los hoteles
        return null;
    }

    Optional<Hotel> buscarPorId(Long id) {
        // TODO: Implementar lógica para buscar un hotel por su ID
        return null;
    }

    List<Hotel> buscarPorCiudad(String ciudad) {
        // TODO: Implementar lógica para buscar hoteles por ciudad
        return null;
    }

    Hotel crear(Hotel hotel) {
        // TODO: Implementar lógica para crear un nuevo hotel
        return null;
    }

    Hotel actualizar(Long id, Hotel hotel) {
        // TODO: Implementar lógica para actualizar un hotel existente
        return null;
    }

    void eliminar(Long id) {
        // TODO: Implementar lógica para eliminar un hotel por su ID
    }

    List<Hotel> buscarConHabitacionesDisponibles() {
        return hotelRepository.findHotelesConHabitacionesDisponibles();
    }

}
