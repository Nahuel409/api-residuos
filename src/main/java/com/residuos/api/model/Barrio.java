package com.residuos.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity
public class Barrio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String nombre;
    String horario;
    String dia;
    String tipoResiduo;

    public Barrio() {
    }

    public Barrio(int id, String nombre, String horario, String dia, String tipoResiduo) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.dia = dia;
        this.tipoResiduo = tipoResiduo;
    }
}
