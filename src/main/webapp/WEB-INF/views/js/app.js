$(function () {
    var shDesc = document.querySelector(".category");
    console.log(shDesc);

    $("dd").hide();

    var dt = $("dt");
    console.log(dt);

    dt.on("click", function () {

        if ($(this).next().is(":visible")) {
            $(this).next().hide();
        }
        else {
            $(this).next().show();
        }
    });

});