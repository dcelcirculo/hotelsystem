package com.devsenior.hotelsystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devsenior.hotelsystem.model.Hotel;
import com.devsenior.hotelsystem.repository.HotelRepository;
import com.devsenior.hotelsystem.service.HotelService;

import lombok.RequiredArgsConstructor;

// Esta clase implementa la interfaz HotelService y contiene la lógica de negocio para manejar los hoteles. Utiliza el repositorio HotelRepository para interactuar con la base de datos y realizar operaciones CRUD sobre los hoteles. Además, implementa métodos para buscar hoteles por ciudad, nombre y disponibilidad de habitaciones.

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Override
    public List<Hotel> listarTodos() {
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> buscarPorId(Long id) {
        return hotelRepository.findById(id);
    }

    @Override
    public List<Hotel> buscarPorCiudad(String ciudad) {
        return hotelRepository.findByCiudad(ciudad);
    }

    @Override
    public Hotel crear(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel actualizar(Long id, Hotel hotel) {
        Optional<Hotel> hotelExiste = hotelRepository.findById(id);

        if (hotelExiste.isPresent()) {
            Hotel hotelActualizado = hotelExiste.get();

            hotelActualizado.setNombre(hotel.getNombre());
            hotelActualizado.setCiudad(hotel.getCiudad());
            hotelActualizado.setDireccion(hotel.getDireccion());
            hotelActualizado.setCategoria(hotel.getCategoria());
            hotelActualizado.setTelefono(hotel.getTelefono());
            return hotelRepository.save(hotelActualizado);
        }
        throw new RuntimeException("Hotel no encontrado con id: " + id);
    }

    @Override
    public void eliminar(Long id) {
        if (!hotelRepository.existsById(id)) {
            throw new RuntimeException("Hotel no encontrado con id: " + id);
        }
        hotelRepository.deleteById(id);
    }

    @Override
    public List<Hotel> buscarConHabitacionesDisponibles() {
        return hotelRepository.findHotelesConHabitacionesDisponibles();
    }

    // Implementación de los métodos de la interfaz HotelService

}
