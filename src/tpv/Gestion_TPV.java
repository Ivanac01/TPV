/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Usuario
 */
public class Gestion_TPV {
    private String usuario,pswd,bd,host;
    private Connection conexion;
    private Statement sentencia;

    public Gestion_TPV(String usuario, String pswd, String bd, String host) {
        this.usuario = usuario;
        this.pswd = pswd;
        this.bd = bd;
        this.host = host;
        conectar();
    }
    private void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://"+host+"/"+bd+"",usuario, pswd);
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error al conectar con la BD:"+ex.toString());
        }
    }
    
    private void desconectar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión con la BD:" + ex.toString());
        }
    }
    
    public boolean insertarUsuario(Gestion_usuario gu){
        boolean resultado = false;
        conectar();
        String sql = String.format("INSERT INTO gestion_usuario (nombre,apellidos,login,password,id_usuario) VALUES ('%s', '%s', '%s', %s, %s)",gu.getNombre(),gu.getApellidos(),gu.getLogin(),gu.getPassword(),gu.getId_usuario());
        try {
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al insertar usuario:" + ex.toString());
            resultado = false;
        }
        desconectar();
        return resultado;
    }
    
    public boolean modificarUsuario(Gestion_usuario gu) {
        boolean resultado = false;
        conectar();
        String sql = String.format("UPDATE gestion_usuario SET password = 56478 WHERE id_usuario = 5",gu.getPassword(),gu.getId_usuario());
        try{
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al borrar empleado:" + ex.toString());
            resultado = false;
        }
        desconectar();
        return resultado;
        
    }
    
    public boolean borrarUsuario(Gestion_usuario gu) {
        boolean resultado = false;
        String sql = String.format("DELETE FROM gestion_usuario WHERE id_usuario = 5",gu.getId_usuario());
        System.out.println("Consulta: " + sql);
        try{
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al borrar usuario:" + ex.toString());
            resultado = false;
        }
        desconectar();
        return resultado;
    }
    
    public boolean insertarVenta_producto(Ventas ve){
        boolean resultado = false;
        conectar();
        String sql = String.format("INSERT INTO ventas (id_producto,id_venta,cantidad_producto,fecha_venta,login,precio_producto) VALUES (%s, %s, %s, %s, '%s', %s)",ve.getId_producto(),ve.getId_venta(),ve.getCantidad_producto(),ve.getFecha_venta(),ve.getLogin(),ve.getPrecio_producto());
        try {
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al insertar producto:" + ex.toString());
            resultado = false;
        }
        desconectar();
        return resultado;
    }
    
    /*public boolean modificarVenta_producto(Ventas ve) {
        boolean resultado = false;
        conectar();
        //String sql = String.format("UPDATE gestion_usuario SET salario = %s WHERE coddepartamento = %s", emp.getSalario(),emp.getCoddepartamento());
        try{
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al borrar empleado:" + ex.toString());
            resultado = false;
        }
        desconectar();
        return resultado;
        
    }*/
    
    public boolean borrarVenta_producto(Ventas ve) {
        boolean resultado = false;
        String sql = String.format("DELETE FROM gestion_usuario WHERE id_producto = 5",ve.getId_producto());
        System.out.println("Consulta: " + sql);
        try{
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al borrar usuario:" + ex.toString());
            resultado = false;
        }
        desconectar();
        return resultado;
    }
    
    public boolean insertarProducto(Gestion_productos gp){
        boolean resultado = false;
        conectar();
        String sql = String.format("INSERT INTO gestion_productos (nombre_producto,pvp,stock,imagen_producto,id_producto) VALUES ('%s', %s, %s, %s, %s)",gp.getNombre_producto(),gp.getPvp(),gp.getStock(),gp.getImagen_producto(),gp.getId_producto());
        try {
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al insertar producto:" + ex.toString());
            resultado = false;
        }
        desconectar();
        return resultado;
    }
    
    /*public boolean modificarProducto(Gestion_productos gp) {
        boolean resultado = false;
        conectar();
        String sql = String.format("UPDATE gestion_usuario SET password = 56478 WHERE id_usuario = 5",gu.getPassword(),gu.getId_usuario());
        try{
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al borrar empleado:" + ex.toString());
            resultado = false;
        }
        desconectar();
        return resultado;
        
    }*/
    
    public boolean borrarProducto(Gestion_productos gp) {
        boolean resultado = false;
        String sql = String.format("DELETE FROM gestion_productos WHERE id_producto = 5",gp.getId_producto());
        System.out.println("Consulta: " + sql);
        try{
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al borrar usuario:" + ex.toString());
            resultado = false;
        }
        desconectar();
        return resultado;
    }
}
