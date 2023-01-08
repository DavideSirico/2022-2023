Nel programma sono presenti 5 classi:
    - una classe Ora;
    - una classe Pattini;
    - una classe Persona;
    - una classe Gruppo;
    - una classe Pista.

La classe Ora contiene i metodi per la gestione dell'orario che utilizzo per gestire le ore di entrata e uscita dei gruppi e per calcolare il tempo rimanente per i pattini in manutenzione.

La classe Pattini serve per gestire la coppia di pattini e fornisce i metodi per la manutenzione e la disponibilità.

La classe Persona mi permette di controllare se è presente un paio di pattini disponibile e di noleggiarli.

La classe Gruppo mi permette di raccogliere le Persone e di gestire il controllo e il noleggio di tutti i pattini necessari oltre alla creazione random delle persone.
    
La classe Pista mi permette di raccogliere i Gruppi che sono in pista e di aggiungerli e rimuoverli.

Nel main ho la variabile che memorizza il fatturato, creo l'oggetto pista e ora tramite il cotruttore vuoto.
Poi creo un vettore di gruppi per la coda e una matrice di pattini per avere sulle righe i pattini della stessa taglia e sulle colonne i singoli pattini.
Nel ciclo while infinito stampo l'orario attuale che aumenterà di 15 secondi ogni secondo poi controllo se bisogna mandare in manutenzione dei pattini e se bisogna toglierli dalla manutenzione.
Creo un gruppo di dimensioni random e lo aggiungo alla coda.
Poi controllo il primo elemento della coda e controllo che possa noleggiare i pattini, se può noleggiarli li noleggia e li aggiunge alla pista e lo rimuovo dalla coda. 
In seguito controllo se ci sono dei gruppi che devo far uscire e calcolo il fatturato.