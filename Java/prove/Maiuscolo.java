import java.util.Scanner;

class Maiuscolo{
    public static void main(String[] args){
        int numero;
        int somma=0;
        Scanner input = new Scanner(System.in);
        // Inizializzazione array
        for(int i=0; i<5; i++){
            System.out.println("Inserisci intero: ");
            numero  = input.nextInt();
            if(numero <= 0){
                continue;
            }
            somma += numero;
        }

    }

}
