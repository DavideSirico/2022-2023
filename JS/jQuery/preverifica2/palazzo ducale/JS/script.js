function es1()
{
    $("video").css("display", "none");
    $("img").css("display", "none");
}
function es2()
{
    console.log($("*:contains(\"Gonzaga\")"));
    $("td:contains(\"Gonzaga\")").css("color","yellow");
    $("td:contains(\"Gonzaga\")").css("font-size","30px");
    
}
function es3()
{
    $("body [href]").attr("href","https://mantovaducale.beniculturali.it/it/");
}
