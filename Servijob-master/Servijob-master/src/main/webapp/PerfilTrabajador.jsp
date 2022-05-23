<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Class.*, Capa_Datos.Modulo" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Content/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="Content/animate.css" rel="stylesheet" type="text/css"/>
        <link href="Content/Estilos.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="top">
            <div class="perfil bg-warning">
                <img  class="rounded-circle" src="Icons/User.svg" alt="">
            </div>
            <div class="col">
                <h1 class="text text-lg-right text-light pt-1 pr-2">SERVIJOB</h1> 
            </div>
        </div>
        <%
         /*Modulo mo=new Modulo(); 
         String id = request.getParameter("id");
         Trabajador tra=new Trabajador();
         Calificacion ca=new Calificacion();
         List<Trabajador> lista=tra.DatosTrabajador(id);*/
        %>
        <div class="container">
            <div class="row p-1">
                <div class="">
                    <img src="Icons/User.svg" width="200" height="200" />
                </div>
                <div class="text-center" id="divDatos">
                    <% 
                        // for(Trabajador x:lista){
                        /* <h1>Nombre: =x.getNombre()+ " " +x.getApellido() </h1>
                        <h2>Servicio: =x.getServicio()</h2>
                    }*/
                    %>
                </div>
            </div>
                    <%
                       /* if(ca.PorcentajeCalificacion(ca.Puntaje(id))<=45){
                            out.print("<div class='puntaje bg-light text-danger'>");
                    
                        }else if(ca.PorcentajeCalificacion(ca.Puntaje(id))>45 && ca.PorcentajeCalificacion(ca.Puntaje(id))<55){
                            out.print("<div class='puntaje bg-light text-warning'>");
                        }else{
                            out.print("<div class='puntaje bg-light text-succes'>");
                        }
                        <h1>Puntaje: =ca.PorcentajeCalificacion(ca.Puntaje(id))</h1>
                         out.print("</div>");*/
                        %>
        </div>
        <script src="Script/ServiJob/PerfilTrabajador.js"></script>
    </body>
</html>
