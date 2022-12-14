package com.enrique.PcComponentes;

/**
 * Clase TarjetaGrafica
 */
public class TarjetaGrafica {
    /**
     * Atributos, propiedades, variables
     */
    private Integer id;
    private String marca;
    private String modelo;

    private String puertos;

    private String memoria;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){this.modelo = modelo;}

    public String getPuertos() {
        return puertos;
    }

    public void setPuertos(String puertos){
        this.puertos= puertos;
    }

    public String getMemoria(){
        return memoria;
    }

    public void setMemoria(String memoria){
        this.memoria= memoria;
    }

    public Integer getPrecio(){
        return precio;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }
}