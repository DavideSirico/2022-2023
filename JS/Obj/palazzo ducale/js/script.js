var immagini = [
    "IMG/Camera-degli-Sposi1.jpg",
    "IMG/cameradeglisposi2.jpg",
    "IMG/cameradeglisposi4.jpg",
    "IMG/camerasposi3jpg.jpg",
    "IMG/sala_dei_giganti1.jpg",
    "IMG/sala_dei_giganti2.jpg",
    "IMG/sala_dei_giganti3.jpeg",
    "IMG/sala_dei_giganti4.jpg"
];

$("#next").click(function () {
    cambiafoto(true);
});

$("#previous").click(function () {
    cambiafoto(false);
});

function cambiafoto(si)
{

    var firstImg = $("img")[1];
    var secondImg = $("img")[2];
    var thirdImg = $("img")[3];

    var firstImgSrc = $(firstImg).attr("src");
    var secondImgSrc = $(secondImg).attr("src");
    var thirdImgSrc = $(thirdImg).attr("src");

    var firstImgIndex = immagini.indexOf(firstImgSrc);
    var secondImgIndex = immagini.indexOf(secondImgSrc);
    var thirdImgIndex = immagini.indexOf(thirdImgSrc);

    if (firstImgIndex == immagini.length - 1)
    {
        firstImgIndex = -1;
    }
    if (secondImgIndex == immagini.length - 1)
    {
        secondImgIndex = -1;
    }
    if (thirdImgIndex == immagini.length - 1)
    {
        thirdImgIndex = -1;
    }
    
    if(si == false)
    {
        $(firstImg).attr("src", immagini[firstImgIndex + 1]);
        $(secondImg).attr("src", immagini[secondImgIndex + 1]);
        $(thirdImg).attr("src", immagini[thirdImgIndex + 1]);
    } else {
        $(firstImg).attr("src", immagini[firstImgIndex - 1]);
        $(secondImg).attr("src", immagini[secondImgIndex - 1]);
        $(thirdImg).attr("src", immagini[thirdImgIndex - 1]);
    }


}