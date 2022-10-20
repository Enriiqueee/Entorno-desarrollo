package com.enrique.PcComponentes;

/**
 * Clase VentiladorCpu
 */
public class VentiladorCpu {
    /**
     * Atributos, propiedades, variables
     */
    private Integer id;
    private String nombre;
    private String modelo;
    private String marca;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){this.modelo = modelo;}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca= marca;
    }

    public Integer getPrecio(){
        return precio;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }
}