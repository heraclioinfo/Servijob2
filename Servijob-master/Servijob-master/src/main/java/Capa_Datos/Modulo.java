
package Capa_Datos;

import Class.*;
import Capa_Datos.Modulo;
import Class.Trabajador;
import util.MySQLConexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Modulo {
    
    public List<Calificacion> PuntajeTrabajador(int IDTrabajador){
        List<Calificacion> List=new ArrayList();
        try{
            MySQLConexion MySQL=new MySQLConexion();
            String SQL = "SELECT Puntaje FROM Calificacion WHERE IDTrabajador=" +IDTrabajador;
            ResultSet result=MySQL.Listar(SQL);            
            while(result.next()){  
                Calificacion c=new Calificacion();
                c.setPuntaje(result.getInt("Puntaje"));
                List.add(c);
            }            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return List;
    }
    
    
    public List<Trabajador> listaTrabajador(int IDTrabajador){
        List<Trabajador> List=new ArrayList();
        try{
            MySQLConexion MySQL=new MySQLConexion();
            String SQL = "SELECT IDTrabajador, Nombre, Apellido, Servicio, Telefono FROM Trabajador WHERE " + IDTrabajador + "=0";
            ResultSet result=MySQL.Listar(SQL);            
            while(result.next()){  
                Trabajador t=new Trabajador();
                t.setIDTrabajador(result.getInt("IDTrabajador"));
                t.setNombre(result.getString("Nombre"));
                t.setApellido(result.getString("Apellido"));
                t.setServicio(result.getString("Servicio"));
                t.setTelefono(result.getString("Telefono"));
                List.add(t);
            }            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return List;
    }
    
    public Trabajador ObtenerInformacionTrabajador(int IDTrabajador){
        Trabajador t=new Trabajador();
        try{
            MySQLConexion MySQL=new MySQLConexion();
            String SQL = "SELECT IDTrabajador, Nombre, Apellido, Servicio, Telefono FROM Trabajador WHERE " + IDTrabajador;
            ResultSet result=MySQL.Listar(SQL);            
            while(result.next()){  
                t.setIDTrabajador(result.getInt("IDTrabajador"));
                t.setNombre(result.getString("Nombre"));
                t.setApellido(result.getString("Apellido"));
                t.setServicio(result.getString("Servicio"));
                t.setTelefono(result.getString("Telefono"));
            }            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return t;
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
}