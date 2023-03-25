/* 
ad ogni pressione del bottone "+"
1)aumenta la dimensione del font di 10px
2)aumenta la dimensione del titolo (da h6->h5->h4->h3->h2->h1) 
  (NB Max titolo h1)
3)aumenta l'altezza e la larghezza dell'immagine di 50px

ad ogni pressione del bottone "-"
1)diminuisce la dimensione del font di 10px (NB min 10 px)
2)diminuisce la dimensione del titolo (da h1->h2->h3->h4->h5->h6)
  (NB min h6)
3)diminuisce l'altezza e la larghezza dell'immagine di 50px
  (NB min H 50px W 50px)
*/
var titles = ["h6","h5","h4","h3","h2","h1"];
var currentTitle = "h6";

function zoom()
{
    // 1)aumenta la dimensione del font di 10px
    // prendo la dimensione in px
    let currentSize = $("p").css("font-size");

    // tolgo la sottostringa "px" dalla dimensione e prendo solo la stringa con il valore
    currentSize = currentSize.split("px")[0];
    // trasformo il valore in numero e gli sommo 10
    currentSize = Number(currentSize) + 10;

    $("p").css("font-size",currentSize+"px");

    // 3)aumenta l'altezza e la larghezza dell'immagine di 50px

    $("img").css("height","+=50px");
    $("img").css("width","+=50px");

    
    // 2)aumenta la dimensione del titolo (da h6->h5->h4->h3->h2->h1) (NB Max titolo h1)
    
    if(currentTitle == "h1")
    {
        return;
    }
    let nextTitle = titles[titles.indexOf(currentTitle)+1];
    $(currentTitle).replaceWith("<"+nextTitle+">" + $(currentTitle).text() + "</"+nextTitle+">");

    currentTitle = nextTitle;
}

function dezoom()
{
    // 1)aumenta la dimensione del font di 10px
    // prendo la dimensione in px
    let currentSize = $("p").css("font-size");

    // tolgo la sottostringa "px" dalla dimensione e prendo solo la stringa con il valore
    currentSize = currentSize.split("px")[0];
    // trasformo il valore in numero e gli sommo 10
    if(currentSize >= 10)
    {
        currentSize = Number(currentSize) - 10;
    }

    $("p").css("font-size",currentSize+"px");

    // 3)aumenta l'altezza e la larghezza dell'immagine di 50px

    if($("img").css("height") >= "50px" && $("img").css("width") >= "50px")
    {
        $("img").css("height","-=50px");
        $("img").css("width","-=50px");
    }

    
    // 2)aumenta la dimensione del titolo (da h6->h5->h4->h3->h2->h1) (NB Max titolo h1)
    
    if(currentTitle == "h6")
    {
        return;
    }
    let nextTitle = titles[titles.indexOf(currentTitle)-1];
    $(currentTitle).replaceWith($("<"+nextTitle+">" + $(currentTitle).text() + "</"+nextTitle+">"));

    currentTitle = nextTitle;
}