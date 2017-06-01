/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes;

/**
 *
 * @author Cesar
 */
public class Producto {

    Producto(String n) {
        switch (n) {
            case "Producto 1":
                id = 1;
                break;
            case "Producto 2":
                id = 2;
                break;
            case "Producto 3":
                id = 3;
                break;
            case "Producto 4":
                id = 4;
                break;
            default: break;
        }
        nombre = n;
        precio = cantidadInventario = 0;
        cantidadCarrito = 1;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public int getCantidadCarrito() {
        return cantidadCarrito;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    public void setCantidadCarrito(int cantidadCarrito) {
        this.cantidadCarrito = cantidadCarrito;
    }

    public String toString() {
        return nombre + ",      " + precio + ",      " + cantidadCarrito;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    private int id;
    private String nombre;
    private float precio;
    private int cantidadInventario;
    private int cantidadCarrito;
}
