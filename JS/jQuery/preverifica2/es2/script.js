var data;
function leggiFile(){
    const myFile = document.getElementById("mioFile");
    const input = myFile.files[0];
    const reader = new FileReader();
      
    reader.readAsText(input);
      
    reader.onload = function (e) {
        var text = e.target.result;
        data = text.split("\n");
        for(var i = 0; i < data.length; i++)
        {
            data[i] = data[i].split(",");
        }
    };
}

function cerca()
{
    var dummy = "<table border=\"solid black 1px\">";
    var dataInizio = $("#text_datainizio").val();
    var dataFine = $("#text_datafine").val();
    var testo = $("#text_testo").val();

    console.log(dataInizio,dataFine,testo);

    for(var i = 0; i < data.length; i++)
    {
        var flag1 = false;
        var flag2 = false;
        var flag3 = false;
        var flag4 = false;
        if(data[i][0] == dataInizio || dataInizio == "")
        {
            flag1 = true;
        }
        if(data[i][1] == dataFine || dataFine == "")
        {
            flag2 = true;
        }
        for(var j = 0; j < data[i].length; j++)
        {
            if(data[i][j]==testo)
            {
                flag3 = true;
            }
        }

        if(testo == "" || flag3 == true)
        {
            flag4 = true;
        }

        flag = flag1 && flag2 && flag4;
        dummy += "<tr>"
        if(flag == true)
        {
            for(var j = 0; j < data[i].length; j++)
            {
                dummy += "<td>" + data[i][j] + "</td>";
            }
            dummy += "</tr>";
        }
    }
    dummy += "</table>"

    $("#visualizza").html(dummy);
}

