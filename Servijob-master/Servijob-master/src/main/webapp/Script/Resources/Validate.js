﻿/* Validaciones en Evento key */
//Solo ingreso de letras sin espacios
function OnlyLettersSpaceless(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = "áéíóúäëïöüabcdefghijklmnñopqrstuvwxyz0123456789";
    especiales = [8];
    tecla_especial = false
    for (var i in especiales) {
        if (key == especiales[i]) {
            tecla_especial = true;
            break;
        }
    }
    if (letras.indexOf(tecla) == -1 && !tecla_especial)
        return false;
}

