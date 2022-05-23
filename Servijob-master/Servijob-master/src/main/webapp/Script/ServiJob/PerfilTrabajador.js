var IDTrabajador = '';

$(document).ready(function () {      
    ID = GetParameterByName('IDTrabajador');    
    if(ID !== ''){
        IDTrabajador = parseInt(ID);
        ObtenerInformacionTrabajador(IDTrabajador);
    }
});
function ObtenerInformacionTrabajador(IDTrabajador){
    op = "2";  
    $.get("control", {op, IDTrabajador}, (response) => {  
        const dato = JSON.parse(response);
        if(dato.IDTrabajador !== 0){  
            let html = ``;    
            html += `<h1>Nombre: = ${dato.Nombre + " " + dato.Apellido}</h1>
                    <h2>Servicio: = ${dato.Servicio}</h2>`;
            $("#divDatos").html(html); 
        } else {
            $("#divDatos").empty();
        }
    });
}


