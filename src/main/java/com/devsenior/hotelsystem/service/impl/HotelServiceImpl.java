package com.devsenior.hotelsystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devsenior.hotelsystem.model.Hotel;
import com.devsenior.hotelsystem.repository.HotelRepository;
import com.devsenior.hotelsystem.service.HotelService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

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
        Hotel existente = hotelRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Hotel no encontrado con id: " + id));

        existente.setNombre(hotel.getNombre());
        existente.setCiudad(hotel.getCiudad());
        existente.setDireccion(hotel.getDireccion());
        existente.setCategoria(hotel.getCategoria());
        existente.setTelefono(hotel.getTelefono());
        existente.setHabitaciones(hotel.getHabitaciones());

        return hotelRepository.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        hotelRepository.deleteById(id);
    }

    @Override
    public List<Hotel> buscarConHabitacionesDisponibles() {
        return hotelRepository.findHotelesConHabitacionesDisponibles();
    }

}
