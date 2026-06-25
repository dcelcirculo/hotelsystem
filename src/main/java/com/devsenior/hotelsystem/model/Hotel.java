package com.devsenior.hotelsystem.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// Esta clase representa la tabla de la base de datos que contiene la información de los hoteles. Cada hotel tiene un id, nombre, ciudad, dirección, categoría y teléfono. Además, cada hotel puede tener varias habitaciones asociadas a él.
// Solo contiene datos y relaciones, no contiene lógica de negocio. La lógica de negocio se encuentra en la clase HotelServiceImpl.

@Entity
@Table(name = "hotels")
@Getter // Mejor uso esto en vez de @Data para evitar problemas de recursividad en las
        // relaciones bidireccionales
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String ciudad;

    private String direccion;
    private Integer categoria;
    private String telefono;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Habitacion> habitaciones;
}
