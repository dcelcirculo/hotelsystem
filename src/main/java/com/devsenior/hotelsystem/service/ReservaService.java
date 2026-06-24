package com.devsenior.hotelsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devsenior.hotelsystem.model.Reserva;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservaService {

    List<Reserva> listarTodas() {
        // TODO: Implementar lógica para listar todas las reservas
        return null;
    }

    Optional<Reserva> buscarPorId(Long id) {
        // TODO: Implementar lógica para buscar una reserva por su ID
        return null;
    }

    Reserva crear(Reserva reserva) {
        // TODO: Implementar lógica para crear una nueva reserva
        return null;
    }

    Reserva actualizar(Long ide, Reserva reserva) {
        // TODO: Implementar lógica para actualizar una reserva existente
        return null;
    }

    void cancelar(Long id) {
        // TODO: Implementar lógica para cancelar una reserva existente
    }

    List<Reserva> listarPorHuesped(Long huespedId) {
        // TODO: Implementar lógica para listar reservas por huésped
        return null;
    }

    Reserva agregarServicio(Long reservaId, Long servicioId) {
        // TODO: Implementar lógica para agregar un servicio a una reserva existente
        return null;
    }
}
