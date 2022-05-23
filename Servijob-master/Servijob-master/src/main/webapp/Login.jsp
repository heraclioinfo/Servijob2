<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <div class="outer">
            <div class="middle animated fadeInRight">
                <div class="login_panel">
                    <div class="ibox-content">
                        <h3 class="text-center">Inicio de sesión</h3>
                        <form action="" method="POST">
                            <div class="form-group"> 
                                <input class="form-control" type="text" placeholder="Usuario"/>
                            </div>
                            <div>
                                <input class="form-control mb-2" type="password" placeholder="Contraseña"/>
                            </div> 
                            <button type="submit" class="btn btn-block btn-warning" name="btnLogin">Ingresar</button>
                            <button type="submit" class="btn btn-block btn-light" name="btnRegistro">Registrarse</button>
                        </form>
                   </div>
                </div>
            </div>
        </div>
    </body>
</html>
