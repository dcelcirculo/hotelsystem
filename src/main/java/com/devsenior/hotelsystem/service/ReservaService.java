package com.devsenior.hotelsystem.service;

import java.util.List;
import java.util.Optional;

import com.devsenior.hotelsystem.model.Reserva;

public interface ReservaService {

    List<Reserva> listarTodas();

    Optional<Reserva> buscarPorId(Long id);

    Reserva crear(Reserva reserva);

    Reserva actualizar(Long id, Reserva reserva);

    void cancelar(Long id);

    List<Reserva> listarPorHuesped(Long huespedId);

    Reserva agregarServicio(Long reservaId, Long servicioId);
}
