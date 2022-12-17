var vite = 3;
var nonMineRimaste = 80;
var campo = new Array(10);
for(var i = 0; i < 10; i++)
{
    campo[i] = new Array(10);
}
function nuovaPartita()
{
    vite = 3;
    document.getElementById("vite").innerHTML = vite;
    nonMineRimaste = 80;
    var dummy = "<table border=\"solid black 1px\">";
    var mine = 20;

    while(mine > 0)
    {
        var x = Math.floor(Math.random() * 10);
        var y = Math.floor(Math.random() * 10);
        if(campo[x][y] != -1)
        {
            campo[x][y] = -1;
            mine--;
        }
    }

    for(var i = 0; i < 10; i++)
    {
        for(var j = 0; j < 10; j++)
        {
            if(campo[i][j] != -1)
            {
                var cont = 0;
                if(i > 0 && j > 0 && campo[i-1][j-1] == -1) cont++;
                if(i > 0 && campo[i-1][j] == -1) cont++;
                if(i > 0 && j < 9 && campo[i-1][j+1] == -1) cont++;
                if(j > 0 && campo[i][j-1] == -1) cont++;
                if(j < 9 && campo[i][j+1] == -1) cont++;
                if(i < 9 && j > 0 && campo[i+1][j-1] == -1) cont++;
                if(i < 9 && campo[i+1][j] == -1) cont++;
                if(i < 9 && j < 9 && campo[i+1][j+1] == -1) cont++;
                campo[i][j] = cont;
            }
        }
    }

    for(var i = 0; i < 10; i++)
    {
        dummy += "<tr>";
        for(var j = 0; j < 10; j++)
        {
            dummy += `<td style="background-color: orange" onclick="scopri(${i},${j})">`;
            dummy += "</td>";
        }
        dummy += "</tr>";
    }
    document.getElementById("campo").innerHTML = dummy;
}
function scopri(x,y)
{
    current = document.getElementsByTagName("td")[x*10+y];
    current.style.backgroundColor = "white";
    if(campo[x][y] == -1)
    {
        vite--;
        document.getElementById("vite").innerHTML = vite;
        current.innerHTML = "💣";
    } else if(campo[x][y] == 0)
    {
        current.innerHTML = " ";
    } else
    {
        current.innerHTML = "" + campo[x][y];
        nonMineRimaste--;
    }
    if(vite == 0)
    {
        // TODO
        alert("Hai perso!");
    }
    if(nonMineRimaste==0)
    {
        alert("Hai vinto!");
    }
    
}