var text;
function leggi_file()
{
    const myFile = document.getElementById("mioFile");

    const input = myFile.files[0];
    const reader = new FileReader();
      
    reader.readAsText(input);
      
    reader.onload = function (e) {
        text = e.target.result;
        text = text.split('\n');
        for(var i = 0; i < text.length; i++)
        {
            text[i] = text[i].split(',');
        }
    }
}
function visualizza()
{
    var dummy = "<table border=\"solid black 1px\">";
    
    console.log(text);
    for(var i = 0; i < text.length; i++)
    {
        dummy += "<tr>"
        for(var j = 0; j < text[i].length; j++)
        {
            dummy += "<td>" + text[i][j] + "</td>"
        }
        dummy += "</tr>"
    }
    dummy += "</table>"
    console.log(dummy);
    document.getElementById("visualizza_table").innerHTML = dummy;
}

function cancella()
{
    riga_da_eliminare = document.forms.form1.t_riga.value;
    console.log(riga_da_eliminare);
    if(isNaN(riga_da_eliminare))
    {
        // TODO CAMBIARE
        document.write("INSERIRE UN NUMERO GRAZIE") 
    }
    if(riga_da_eliminare>text.length || riga_da_eliminare<0)
    {
        document.write("MA SEI BOH");
    }
    text.splice(riga_da_eliminare,1);
    console.log(text);
}

function disabilita()
{
    if($("#conferma").is(":checked"))
    {
        $("#b_cancella").attr('disabled', false);
    } else 
    {
        $("#b_cancella").attr('disabled', true);
    }
}