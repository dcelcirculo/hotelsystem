package com.devsenior.hotelsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "perfil_contacto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PerfilContacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String telefonoEmergencia;
    private String direccion;
    private String pais;
    private String nacionalidad;

    @OneToOne(mappedBy = "perfilContacto", cascade = CascadeType.ALL)
    @JsonIgnore
    private Huesped huesped;

}
