package com.enrique.PcComponentes;

/**
 * Clase Placa_Base
 */
public class PlacaBase {
    /**
     * Atributos, propiedades, variables
     */
    private Integer id;
    private String marca;
    private String modelo;

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
