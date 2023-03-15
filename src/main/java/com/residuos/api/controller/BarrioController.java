package com.residuos.api.controller;

import com.residuos.api.model.Barrio;
import com.residuos.api.service.BarrioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class BarrioController {
    @Autowired
    BarrioService barrioService;

    @GetMapping
    public ResponseEntity<List<Barrio>>verBarrios(){
       List<Barrio> barrios = barrioService.verBarrios();
       return new ResponseEntity<>(barrios, HttpStatus.OK);
    }
    @GetMapping("/{nombre}")
    public ResponseEntity<Barrio>verBarrio(@PathVariable String nombre){
        Barrio barrios = barrioService.buscarBarrio(nombre);
        return new ResponseEntity<>(barrios, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Barrio> addBarrio(@RequestBody Barrio barrio){
       Barrio barrio1 = barrioService.addBarrio(barrio);
        return new ResponseEntity<>(barrio, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Barrio> editarBarrio(@RequestBody Barrio barrio){
        Barrio barrio1 = barrioService.editarBarrio(barrio);
        return new ResponseEntity<>(barrio1,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Barrio> eliminarBarrio(@PathVariable int id){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
