package com.residuos.api.service;

import com.residuos.api.model.Barrio;
import com.residuos.api.model.NotFoundException;
import com.residuos.api.repository.BarrioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarrioService {
    @Autowired
    BarrioRepository barrioRepository;

    public Barrio addBarrio(Barrio barrio){return barrioRepository.save(barrio);}
   public Barrio editarBarrio(Barrio barrio){return barrioRepository.save(barrio);}
    public List<Barrio> verBarrios(){return barrioRepository.findAll();}
    public void eliminarBarrio(int id){barrioRepository.deleteById(id);}

    public Barrio buscarBarrio(String nombre){
        Optional<Barrio> barrioOptional = barrioRepository.findByNombreIgnoreCase(nombre);
        return barrioOptional.orElseThrow(() -> new NotFoundException("Barrio no encontrado"));
    }
}
