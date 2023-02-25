$(document).ready(function(){

    $("p").addClass("one");

    $("table").css("border","1px black solid");

    $("table tr:odd").css("background-color","white")
    $("table tr:even").css("background-color","black")

    $("#id").parents().css("border","red 1px solid")
    $("#id").children().css("border","blue 1px solid")
    $("#id").siblings().css("border","green 1px solid")
    
    $("[href='index.html']").html("Casa");
});
  