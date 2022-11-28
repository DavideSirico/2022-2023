import java.util.Random;

class MainPersona
{
    public static void main(String[] args)
    {
        int codice = 1;
        int DIM = 10;
        Persona[] persone = new Persona[DIM];
        Random rand = new Random();

        int eta;
        String nome = "aaaaa";
        String cognome = "AAAAA";
        for(int i = 0; i < DIM; i++)
        {
            eta = rand.nextInt(31)+20;
            persone[i] = new Persona(codice,cognome,nome,eta);
            codice++;
            char dummy = nome.charAt(0);
            nome = nome.replace(dummy, ++dummy);
            cognome = nome.toUpperCase();

        }

        for(int i = 0; i < DIM; i++)
        {
            System.out.println("ID: " + persone[i].getId());
            System.out.println("Cognome: " + persone[i].getCognome());
            System.out.println("Nome: " + persone[i].getNome());
            System.out.println("Eta: " + persone[i].getEta());
        }

    }
}
