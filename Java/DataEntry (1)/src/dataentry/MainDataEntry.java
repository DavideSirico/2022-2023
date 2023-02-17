/*
 Creare un metodo main() per vedere il corretto funzionamento di una classe  dataEntry().
 Nella classe c'è un metodo controllaDati() che ritorna un boolean se tutto è andato a buon fine.
 In particolare provate a passare una stringa e un intero: se riuscite, gestite tutto con Exceptions.
 Es: di se ho una classe persona: [cognome, nome, eta, reddito]
 quando viene passato l'attributo cognome a controllaDati() se ci sono caratteri che non solo alfabetici viene segnalato errore di data entry.
 In questo caso viene richiesto il dato all'utente.
 Ovviamente il metodo dataEntry() prevederà overloading.
*/
package dataentry;
import java.util.Scanner;
public class MainDataEntry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataEntry d = new DataEntry();
        Persona p = new Persona();
        
        String dummy;
        do{
            System.out.print("Nome: ");
            dummy = input.nextLine();
        } while(!d.controllaDati(dummy));
        p.setNome(dummy);
        
        do{
            System.out.print("Cognome: ");
            dummy = input.nextLine();
        } while(!d.controllaDati(dummy));
        p.setCognome(dummy);
        
        int dummyEta = 0;
        boolean flag = true;
        do{
            System.out.print("Eta': ");
            try{
                dummyEta = input.nextInt();
                if(d.controllaDati(dummyEta))
                {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Inserire solo numeri");
                input.nextLine();
                flag = true;
            }
        } while(flag);
        p.setEta(dummyEta);
        
        int dummyReddito = 0;
        flag = true;
        do{
            System.out.print("Reddito: ");
            try{
                dummyReddito = input.nextInt();
                if(d.controllaDati(dummyReddito))
                {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Inserire solo numeri");
                input.nextLine();
                flag = true;
            }
        } while(flag);
        p.setReddito(dummyReddito);
        System.out.println(p.toString());
    }
    
}
