package com.example.apiRegistro.repositorios;

import com.example.apiRegistro.modelos.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonajeRepositorio extends JpaRepository<Personaje,Integer> {
}
