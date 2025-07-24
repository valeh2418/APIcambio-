package com.example.apiRegistro.servicios;

import com.example.apiRegistro.modelos.Personaje;
import com.example.apiRegistro.repositorios.IPersonajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServicio {

    //EL servicio llama al repositorio
    @Autowired //Inyeccion de dependencia
    IPersonajeRepositorio repositorio;

    //ACTIVO LOS METODOS DE GUARDADO
    public boolean guardarPersonaje(Personaje datosDelPersonaje)throws Exception{
        try{
            repositorio.save(datosDelPersonaje);
            return true;
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }


}
