$(document).ready(function () {  
    listaTrabajador(0);    
});
function listaTrabajador(IDTrabajador){
    op = "1";  
    $.get("control", {op, IDTrabajador}, (response) => {  
        const dato = JSON.parse(response);
        if(dato.length > 0){  
            let html = ``;
            dato.forEach(d => {
            html += `<div class="users" onclick='PerfilTrabajador(${d.IDPokemon});'>
                    <img  src="Icons/User.svg" alt="">
                    <h4>${d.Nombre + " " +d.Apellido}</h4>
                    <p>${d.Servicio}</p>
                    </div>`;
            $("#divCards").html(html); 
        }); 
        }else {
            $("#divCards").empty();
        }
    });
}
function PerfilTrabajador(IDTrabajador) {
    window.location.href = "PerfilTrabajador.jsp?IDTrabajador=" + IDTrabajador;    
}