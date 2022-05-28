$(document).ajaxComplete(function (event, xhr, settings) {
    var jsonResult = JSON.parse(xhr.responseText);
    if (jsonResult !== undefined && jsonResult.NewUrl)
        window.location = jsonResult.NewUrl;
});

$(".vision-password").click(function () {
    if ($(".vision-password").hasClass('fa-eye-slash') === true) {
        $(".vision-password").removeClass('fa-eye-slash').addClass('fa-eye').attr("data-original-title", "Ocultar Contraseña");
        $("#txtPassword")[0].type = "text";
    } else {
        $(".vision-password").removeClass('fa-eye').addClass('fa-eye-slash').attr("data-original-title", "Mostrar Contraseña");
        $("#txtPassword")[0].type = "password";
    }
    $("#txtPassword").focus();
});

$('#btnLogin').click(function () {
    let Email = $("#txtNetworkUser").val();
    let Contraseña = $("#txtPassword").val();
    if(!checkEmail($("#txtNetworkUser"))){        
        $("#divMessage").html(`<div class="alert alert-danger mt-3 mb-0">El email ingresado no es válido.</div>`);
        return false;
    } else {
        $("#divMessage").empty();
    }
    ValidarCliente(Email, Contraseña);
});

function ValidarCliente(Email, Contraseña){     
    op = "1";  
    $.get("ControlCliente", {op, Email, Contraseña}, (response) => {  
        const dato = JSON.parse(response); 
        if(dato.IDCliente > 0){  
            let NombreCompleto = dato.Nombre + " "+ dato.Apellido;
            SearchWorker(dato.IDCliente, NombreCompleto);
        } else {
            $("#divMessage").html(`<div class="alert alert-danger mt-3 mb-0">Usuario y/o contraseña incorrecto.</div>`);
        }
    });
}

function SearchWorker(IDCliente, NombreCompleto) {
    sessionStorage.setItem('IDCliente', IDCliente);
    sessionStorage.setItem('NombreCompleto', NombreCompleto);
    window.location.href = "SearchWorker.jsp";    
}