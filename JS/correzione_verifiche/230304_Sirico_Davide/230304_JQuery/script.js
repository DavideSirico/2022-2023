/*
Inserire 3 nuovi bottoni nel file verifica2.html
denominati es1, es2, es3

es1: se premuto colora tutte le tabelle presenti nel documento
     a righe chiare e scure alternate (stile zebrato)

es2: in tutti i tag che contengono l'attributo name che comincia per "F"
     impostare l'attributo name = "new"+valore precedente del name

     es. <INPUT type="text" name="Fermi01" id="id01">
         diventerà
         <INPUT type="text" name="newFermi01" id="id01">

     NB (per verificare l'avvenuto cambiamento -> F12 -> Analisi pagina)    

es3: impostare a giallo il background color
     delle label dei checkbox selezionati (ossia in stato checked)


NOTA BENE
non potete modificare i TAG HTML del file verifica2.html
(ad esempio non potete aggiungere ID)
ma solo aggiungere i 3 bottoni e il codice JS
*/
function es1()
{
	$("table tr:odd").css("backgroundColor","rgb(50,50,50)");
	$("table tr:even").css("backgroundColor","rgb(200,200,200)");
	
}
function es2()
{
	var tags = $("[name^=F]");
	for(var i = 0; i < tags.length; i++)
	{
		var currentName = $(tags[i]).attr("name");
		$(tags[i]).attr("name","new" + currentName);
	}
}

function es3()
{
	var rosso = $("#id_rosso").is(":checked");
	var verde = $("#id_verde").is(":checked");
	var bianco = $("#id_bianco").is(":checked");
	
	if(rosso)
	{
		$("label[for=id_rosso]").css("backgroundColor","yellow");
	}
	if(bianco)
	{
		$("label[for=id_bianco]").css("backgroundColor","yellow");
	}
	if(verde)
	{
		$("label[for=id_verde]").css("backgroundColor","yellow");
	}

	/*
	$("input").each(function()
	{
		if($(this).prop("checked"))
		{
			$(this).next().css("backgroundColor","yellow");
		}
	})
	*/
}