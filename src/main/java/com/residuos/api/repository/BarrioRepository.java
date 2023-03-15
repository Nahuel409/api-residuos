package com.residuos.api.repository;

import com.residuos.api.model.Barrio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BarrioRepository extends JpaRepository<Barrio, Integer> {

    Optional<Barrio>findByNombreIgnoreCase(String nombre);
}
