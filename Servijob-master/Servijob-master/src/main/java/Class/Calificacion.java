
package Class;

import java.util.*;
import java.sql.*;
import util.MySQLConexion;

public class Calificacion {
    private int IDCalificacion;
    private int IDCliente;
    private int IDTrabajador;
    private int puntaje;
    
    public double PromedioCalificacion(List<Calificacion> list){
       double sum=0;
       for(Calificacion x:list){
           sum += x.puntaje;
       }
       return sum/list.size();
    }
    public double PorcentajeCalificacion(List<Calificacion> list){
       return (PromedioCalificacion(list)/5)*100;
   }
    
    public int getIDCalificacion() {
        return IDCalificacion;
    }

    public void setIDCalificacion(int IDCalificacion) {
        this.IDCalificacion = IDCalificacion;
    }

    public int getIDTrabajador() {
        return IDTrabajador;
    }

    public void setIDTrabajador(int IDTrabajador) {
        this.IDTrabajador = IDTrabajador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }
    
}
