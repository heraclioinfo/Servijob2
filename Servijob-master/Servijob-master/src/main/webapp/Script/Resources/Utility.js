//Scrollbar Textarea
function ScrollbarInput() {
    $("textarea.scrollbar-input").hover(
        function () {
            $(this).addClass('scrollbar-input-hover');
        }, function () {
            $(this).removeClass('scrollbar-input-hover');
        }
    );
}

function CountCaracters(n, t) {
    $(t).html($(n).val().length + " de " + $(n).attr("maxlength") + " caracteres.");
    $(n).keyup(function () {
        var i = $(n).attr("maxlength"),
            r = $(n).val().length;
        $(t).text(r + " de " + i + " caracteres.")
    })
}