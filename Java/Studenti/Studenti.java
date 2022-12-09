class Main{
    public static void main(String[] args){
        Studenti studente1 = new Studenti();
        Studenti studente2 = new Studenti("Davide","Sirico",15);
        studente2.stampa();
    }
}

class Studenti{
    private String nome;
    private String cognome;
    private int eta;
    
    Studenti(){
        nome = "";
        cognome = "";
        eta = 0;
    }
    Studenti(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    void stampa(){
        System.out.println(nome + " " + cognome + " " + eta);
    }
}
