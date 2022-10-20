package com.enrique.PcComponentes;

/**
 * Clase Monitor
 */
public class Monitor {
    /**
     * Atributos, propiedades, variables
     */
    private Integer id;
    private String marca;
    private Integer frecuencia;

    private String fabricante;
    private Integer precio;

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

    public Integer getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Integer frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getFabricante(){return fabricante;}

    public void setFabricante(String fabricante){this.fabricante = fabricante;}

    public Integer getPrecio(){
        return precio;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }
}
