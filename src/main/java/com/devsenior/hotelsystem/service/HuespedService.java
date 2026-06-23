package com.devsenior.hotelsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devsenior.hotelsystem.model.Huesped;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HuespedService {

    List<Huesped> listarTodos() {
        // TODO: Implementar lógica para listar todos los huéspedes
        return null;
    }

    Optional<Huesped> buscarPorId(Long id) {
        // TODO: Implementar lógica para buscar un huésped por su ID
        return null;
    }

    Huesped crear(Huesped huesped) {
        // TODO: Implementar lógica para crear un nuevo huésped
        return null;
    }

    Huesped actualizar(Long id, Huesped huesped) {
        // TODO: Implementar lógica para actualizar un huésped existente
        return null;
    }

    void eliminar(Long id) {
        // TODO: Implementar lógica para eliminar un huésped por su ID
    }

    List<Huesped> buscarPorNombreOApellido(String texto) {
        // TODO: Implementar lógica para buscar huéspedes por nombre o apellido
        return null;
    }
}
