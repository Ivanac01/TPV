/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpv;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Ventas {
    String login;
    int id_producto, id_venta, cantidad_producto;
    float precio_producto;
    Date fecha_venta;
    
    public Ventas(){
        
    }
    
    public Ventas(String login, int id_producto, int id_venta, int cantidad_producto, float precio_producto, Date fecha_venta){
        this.login = login;
        this.id_producto = id_producto;
        this.id_venta = id_venta;
        this.cantidad_producto = cantidad_producto;
        this.precio_producto = precio_producto;
        this.fecha_venta = fecha_venta;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getLogin() {
        return login;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getId_venta() {
        return id_venta;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public float getPrecio_producto() {
        return precio_producto;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }
    
    
}
