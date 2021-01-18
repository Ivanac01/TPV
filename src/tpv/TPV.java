/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpv;
import java.sql.Timestamp;
/**
 *
 * @author Usuario
 */
public class TPV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gestion_TPV g = new Gestion_TPV("root", "", "tpv_db", "localhost");
        Gestion_usuario gu = new Gestion_usuario("Nico", "García", "nico.garcastillo@gmail.com", 12354, 5);
        //Ventas ve = new Ventas(4,7,1,null,"nico.garcastillo@gmail.com",15.99);
        //g.insertarUsuario(gu);
        //g.modificarUsuario(gu);
        g.borrarUsuario(gu);
        //g.insertarProducto(ve);
    }
    
}
