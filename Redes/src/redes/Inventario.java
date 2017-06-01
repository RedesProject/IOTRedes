/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class Inventario {
    public Inventario(){
        listaProductos = new ArrayList<Producto>();
        generarProductos();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public void generarProductos(){
        float[] precios = {11200, 1800, 9500, 5000};
        for(int i = 0; i < 4; i++){
            Producto p = new Producto("Producto "+ (i + 1));
            p.setPrecio(precios[i]);
            p.setCantidadInventario((int)(Math.random() * 50));
            agregarProductos(p);
        }
    }
    
    public Producto buscar(String p){
        for(int i = 0; i < 4; i++){
            if(p.equals(listaProductos.get(i).getNombre()))
                return listaProductos.get(i);
        }
        return null;
    }

    public void agregarProductos(Producto producto){
         getListaProductos().add(producto);
    }
    
    private ArrayList<Producto> listaProductos;
}
