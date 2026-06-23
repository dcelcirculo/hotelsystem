package com.devsenior.hotelsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devsenior.hotelsystem.model.Habitacion;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class HabitacionService {

    List<Habitacion> listarTodas() {
        // TODO: Implementar lógica para listar todas las habitaciones
        return null;
    }

    Optional<Habitacion> buscarPorId(Long id) {
        // TODO: Implementar lógica para buscar una habitación por su ID
        return null;
    }

    List<Habitacion> listarPorHotel(Long hotelId) {
        // TODO: Implementar lógica para listar habitaciones por hotel
        return null;
    }

    List<Habitacion> listarDisponiblesPorHotel(Long hotelId) {
        // TODO: Implementar lógica para listar habitaciones disponibles por hotel
        return null;
    }

    Habitacion crear(Habitacion habitacion, Long hotelId) {
        // TODO: Implementar lógica para crear una nueva habitación en un hotel
        return null;
    }

    Habitacion actualizar(Long id, Habitacion habitacion) {
        // TODO: Implementar lógica para actualizar una habitación existente
        return null;
    }

    void eliminar(Long id) {
        // TODO: Implementar lógica para eliminar una habitación por su ID
    }

    List<Habitacion> buscarPorPrecioMaximo(Double precioMaximo) {
        // TODO: Implementar lógica para buscar habitaciones por precio máximo
        return null;
    }
}
