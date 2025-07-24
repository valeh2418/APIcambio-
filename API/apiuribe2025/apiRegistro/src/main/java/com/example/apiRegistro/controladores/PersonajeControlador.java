package com.example.apiRegistro.controladores;

import com.example.apiRegistro.modelos.Personaje;
import com.example.apiRegistro.servicios.PersonajeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personajes")
public class PersonajeControlador {

    //llama al servicio
    @Autowired
    PersonajeServicio servicio;

    //metodo para responder al front
    @PostMapping
    public ResponseEntity<?>responderAlGuardar(@RequestBody Personaje datosDelFront){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.guardarPersonaje(datosDelFront));
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

}
