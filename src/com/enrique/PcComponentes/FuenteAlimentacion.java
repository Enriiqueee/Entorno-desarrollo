package com.enrique.PcComponentes;

/**
 * Clase FuenteAlimentacion
 */
public class FuenteAlimentacion{
    /**
     * Atributos, propiedades, variables
     */
    private Integer id;
    private String marca;
    private String dimensiones;
    private String potencia;

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
    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}
