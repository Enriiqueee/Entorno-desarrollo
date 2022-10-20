package com.enrique.PcComponentes;

/**
 * Clase DiscoDuro
 */
public class DiscoDuro {
    /**
     * Atributos, propiedades, variables
     */
    private Integer id;
    private String marca;
    private String dimensiones;
    private String capacidad;

    /**
     * Metodos, funciones, comportamiento
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
