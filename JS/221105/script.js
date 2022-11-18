function change(options){
    switch(options){
        case 'inserisci':
            document.getElementById('inserisci').style = "display: block";
            document.getElementById('modifica').style = "display: none";
            document.getElementById('cancella').style = "display: none";
            document.getElementById('cerca').style = "display: none";
            break;
        case 'modifica':
            document.getElementById('inserisci').style = "display: none";
            document.getElementById('modifica').style = "display: block";
            document.getElementById('cancella').style = "display: none";
            document.getElementById('cerca').style = "display: none";
            break;
        case 'cancella':
            document.getElementById('inserisci').style = "display: none";
            document.getElementById('modifica').style = "display: none";
            document.getElementById('cancella').style = "display: block";
            document.getElementById('cerca').style = "display: none";
            break;
        case 'cerca':
            document.getElementById('inserisci').style = "display: none";
            document.getElementById('modifica').style = "display: none";
            document.getElementById('cancella').style = "display: none";
            document.getElementById('cerca').style = "display: block";
            break;
    }
};

var nome = "";
var cognome = "";
var numeroTelefonico = "";

function inserisci(){
    nome += document.getElementById('nomeInserisci').value;
    cognome += document.getElementById('cognomeInserisci').value;
    numeroTelefonico += document.getElementById('numeroInserisci').value;
    nome += ", ";
    cognome += ", ";
    numeroTelefonico += ", ";
    console.log(nome);
    console.log(cognome);
    console.log(numeroTelefonico);
}

function modifica(){

}

function cancella(){

}

function cerca(){
    
}