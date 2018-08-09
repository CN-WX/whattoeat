$(function () {
    var run = 0,
        heading = $("h1"),
        timer;
    $("#start").click(function () {
        var list = $("#list").val().replace(/\n+/g, ",").split(",");
        if (!run) {
            heading.html(heading.html().replace("Eat This!","What to eat?"));
            $(this).val("Start");

            timer = setInterval(function () {
                var r = Math.ceil(Math.random() * list.length),
                    food = list [r - 1];
                $("#what").html(food);
                var rTop = Math.ceil(Math.random() * $(document).height()),
                    rLeft = Math.ceil(Math.random() * ($(document).width() - 50)),
                    rSize = Math.ceil(Math.random() * (37 - 14) + 14);
                $("<span class='temp'></span>").html(food).hide().css({
                    "top": rTop,
                    "left": rLeft,
                    "color": "rgba(0,0,0,." + Math.random() + ")",
                    "fontSize": rSize + "px"
                }).appendTo("body").fadeIn("slow", function () {
                    $(this).fadeOut("slow", function () {
                        $(this).remove();
                    });
                })
            }, 50);
            run = 1;
        } else {
            heading.html(heading.html().replace("What to eat?","Eat This!"));
            $(this).val("Try again");
            clearInterval(timer);
            run = 0;
        }
    })
});