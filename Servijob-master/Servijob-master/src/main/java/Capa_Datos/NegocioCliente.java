
package Capa_Datos;

import Class.*;
import util.MySQLConexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class NegocioCliente {
    
    public Cliente ValidarCliente(String Email, String Contraseña){
        Cliente c=new Cliente();
        try{
            MySQLConexion MySQL=new MySQLConexion();
            String SQL = "SELECT IDCliente, Nombre, Apellido FROM cliente WHERE UPPER(Email) = UPPER('"+ Email +"') AND Contraseña = '"+ Contraseña + "'";
            ResultSet result=MySQL.Listar(SQL);            
            while(result.next()){
                c.setIDCliente(result.getInt("IDCliente"));
                c.setNombre(result.getString("Nombre"));
                c.setApellido(result.getString("Apellido"));
            }            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return c;
    }
    public int RegistrarCliente(String Nombre, String Apellido, String Telefono, String Contraseña, int TipoDocumento, String NumeroDocumento, String Email ){
        Comentario c= new Comentario();
        MySQLConexion MySQL=new MySQLConexion();
        String cad = "INSERT INTO cliente(Nombre, Apellido, Telefono, Contraseña, TipoDocumento, NumeroDocumento, Email) VALUES ('" + Nombre + "','" + Apellido + "','" + Telefono + "','" + Contraseña + "'," + TipoDocumento + ",'" + NumeroDocumento + "','" + Email + "')";
        return MySQL.Ejecutar(cad);
    }
    public int ActualizarCliente(String IDUbigeoDistrito, String Nombre, String Apellido, String Telefono, String Contraseña, String FechaNacimiento, int TipoDocumento, String NumeroDocumento, String Email ){
        Comentario c= new Comentario();
        MySQLConexion MySQL=new MySQLConexion();
        String cad = "UPDATE `cliente` SET `IDUbigeoDistrito`='" + IDUbigeoDistrito + "',`Nombre`='" + Nombre + "',`Apellido`='" + Apellido + "',`Telefono`='" + Telefono + "',`Contraseña`='" + Contraseña + "',`FechaNacimiento`='" + FechaNacimiento + "',`TipoDocumento`='" + TipoDocumento + "',`NumeroDocumento`='" + NumeroDocumento + "',`Email`='" + Email + "'";
        return MySQL.Ejecutar(cad);
    }
    
    
    public List<Cliente> listaClientes(){
        List<Cliente> List=new ArrayList();
        try{
            MySQLConexion MySQL=new MySQLConexion();
            String SQL = "SELECT Nombre, Apellido, Telefono FROM Cliente";
            ResultSet result=MySQL.Listar(SQL);            
            while(result.next()){  
                Cliente t=new Cliente();
                t.setNombre(result.getString("Nombre"));
                t.setApellido(result.getString("Apellido"));
                t.setTelefono(result.getString("Telefono"));
                List.add(t);
            }            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return List;
    }
    public Cliente ObtenerInformacionCliente(int IDCliente){
        Cliente c=new Cliente();
        try{
            MySQLConexion MySQL=new MySQLConexion();
            String SQL = "SELECT `Nombres`, `Apellidos`, `Telefono`, `Contraseña`, `FechaNacimiento`, `TipoDocumento`, `NumeroDocumento` FROM `cliente` WHERE IDCliente=" + IDCliente;
            ResultSet result=MySQL.Listar(SQL);            
            while(result.next()){
                c.setNombre(result.getString("Nombre"));
                c.setApellido(result.getString("Apellido"));
                c.setTelefono(result.getString("Telefono"));
                c.setContraseña(result.getString("Contraseña"));
                c.setFechaNacimiento(result.getString("FechaNacimiento"));
                c.setTipoDocumento(result.getInt("TipoDocumento"));
                c.setNumeroDocumento(result.getString("NumeroDocumento"));              
            }            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return c;
    }
    
}
