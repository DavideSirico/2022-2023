// ! aggiunto delle funzioni

var text;
function leggiFile(){
	const myFile = document.getElementById("mioFile");

	const input = myFile.files[0];
	const reader = new FileReader();
	  
	reader.readAsText(input);
	  
	reader.onload = function (e) {
		text = e.target.result;
		text = text.split('\n');
		// creo la matrice
		for(var i = 0; i < text.length; i++)
		{
			text[i] = text[i].split(',');
		}
	};
}

function pari()
{
	
	for(var i = 0; i < text.length; i++)
	{
		// conto i numeri pari e mi salvo il primo numero pari
		var numeroPari = -1;
		var counter = 0;
		for(var j = 0; j < text[i].length; j++)
		{
			if(text[i][j]%2 == 0)
			{
				if(numeroPari==-1)
				{
					numeroPari = text[i][j];
				}
				counter++;
			}
		}
		// se sono tutti dispari (non pari) li azzero
		if(counter == 0)
		{
			for(var j = 0; j < text[i].length; j++)
			{
				text[i][j] = 0;
			}
		// altrimenti 
		} else 
		{
			for(var j = 0; j < text[i].length; j++)
			{
				if(text[i][j]%2 == 1)
				{
					text[i][j] = numeroPari;
				}
			}
		}
	}
}

function ordina()
{
	for(var i = 0; i < text.length; i++)
	{
		for(var j = 0; j < text[i].length-1; j++)
		{
			for(var k = j + 1; k < text[i].length; k++)
			{
				if(Number(text[j][i])>Number(text[k][i]))
				{
					var temp = text[k][i];
					text[k][i] = text[j][i];
					text[j][i] = temp;
				}
			}
		}
	}
}	

function visualizza()
{
	// visualizzo la table nella pagina
	var dummy = "<table border=\"1px black solid\">";
	for(var i = 0; i < text.length; i++)
	{
		dummy += "<tr>"
		for(var j = 0; j < text[i].length; j++)
		{
			dummy += "<td>";
			dummy += text[i][j];
			dummy += "</td>";
		}
		dummy += "</tr>";
	}
	dummy += "</table>";
	document.getElementById("visualizza").innerHTML = dummy;
}