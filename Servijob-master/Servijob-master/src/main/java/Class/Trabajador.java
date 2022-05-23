package Class;

import java.util.*;
import java.sql.*;
import util.MySQLConexion;

public class Trabajador {
    private int IDTrabajador;
    private String Nombre;
    private String Servicio;
    private String Telefono;
    private String Apellido;
    private int IDCalificacion;
    
    public int getIDTrabajador() {
        return IDTrabajador;
    }

    public void setIDTrabajador(int IDTrabajador) {
        this.IDTrabajador = IDTrabajador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getIDCalificacion() {
        return IDCalificacion;
    }

    public void setIDCalificacion(int IDCalificacion) {
        this.IDCalificacion = IDCalificacion;
    }
    
}
