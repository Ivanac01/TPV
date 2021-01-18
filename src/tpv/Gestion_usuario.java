/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpv;

/**
 *
 * @author Usuario
 */
public class Gestion_usuario {
    String nombre, apellidos, login;
    int password, id_usuario;
    
    public Gestion_usuario(){
        
    }
    
    public Gestion_usuario(String nombre, String apellidos, String login, int password, int id_usuario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.login = login;
        this.password = password;
        this.id_usuario = id_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }
       
}
