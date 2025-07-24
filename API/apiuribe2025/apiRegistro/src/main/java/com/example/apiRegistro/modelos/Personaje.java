package com.example.apiRegistro.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer cantidadVida;
    private Integer poderAtaque;
    private Integer poderDefensa;
    private String fotografia;
    private LocalDate fechaCreacion;
    private boolean  continuaVivo;
    private String categoria;

    public Personaje() {
    }

    public Personaje(Integer id, String nombre, Integer cantidadVida, Integer poderAtaque, Integer poderDefensa, String fotografia, LocalDate fechaCreacion,
                     boolean continuaVivo,String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadVida = cantidadVida;
        this.poderAtaque = poderAtaque;
        this.poderDefensa = poderDefensa;
        this.fotografia = fotografia;
        this.fechaCreacion = fechaCreacion;
        this.continuaVivo = continuaVivo;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(Integer cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    public Integer getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(Integer poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public Integer getPoderDefensa() {
        return poderDefensa;
    }

    public void setPoderDefensa(Integer poderDefensa) {
        this.poderDefensa = poderDefensa;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isContinuaVivo() {
        return continuaVivo;
    }

    public void setContinuaVivo(boolean continuaVivo) {
        this.continuaVivo = continuaVivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
