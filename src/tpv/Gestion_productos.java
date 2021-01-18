/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpv;
import java.sql.Blob;
/**
 *
 * @author Usuario
 */
public class Gestion_productos {
    String nombre_producto;
    float pvp;
    int id_producto, stock;
    Blob imagen_producto;
    
    public Gestion_productos(){
        
    }
    
    public Gestion_productos(String nombre, float pvp, int id_producto, int stock, Blob imagen_producto){
        this.nombre_producto = nombre;
        this.pvp = pvp;
        this.id_producto = id_producto;
        this.stock = stock;
        this.imagen_producto = imagen_producto;
    }

    public void setNombre_producto(String nombre) {
        this.nombre_producto = nombre;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setImagen_producto(Blob imagen_producto) {
        this.imagen_producto = imagen_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public float getPvp() {
        return pvp;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getStock() {
        return stock;
    }

    public Blob getImagen_producto() {
        return imagen_producto;
    }
    
    
}
