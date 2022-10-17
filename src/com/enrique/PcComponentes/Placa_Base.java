package com.enrique.PcComponentes;

/**
 * Clase Placa_Base
 */
public class Placa_Base {
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

    private void setId(Integer id) {

        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante(){return fabricante;}

    public void setFabricante({this.fabricante = fabricante})

    public Integer getPrecio(){
        return precio;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }
}