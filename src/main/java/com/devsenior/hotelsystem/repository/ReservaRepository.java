package com.devsenior.hotelsystem.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import com.devsenior.hotelsystem.model.EstadoReserva;
import com.devsenior.hotelsystem.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    List<Reserva> findByHuespedId(Long huespedId);

    List<Reserva> findByEstado(EstadoReserva estado);

    @Query("SELECT r FROM Reserva r WHERE r.fechaIngreso BETWEEN :fechaInicio And :fechaFin")
    List<Reserva> findReservasByFechaIngreso(
            @Param("fechaInicio") LocalDate fechaInicio,
            @Param("fechaFin") LocalDate fechaFin);

    @Query("SELECT r FROM Reserva r WHERE r.estado = 'CONFIRMADA' OR r.estado = 'PENDIENTE'")
    List<Reserva> findReservasEstadoConfirmadaOPendiente();
}
