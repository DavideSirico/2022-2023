import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner input = new Scanner(System.in);
            String dummy = bufferedReader.readLine();
            if (dummy == null) {
                System.out.println("File vuoto");
                input.close();
                bufferedReader.close();
                fileReader.close();
                return;
            }

            BinaryTree bt = new BinaryTree();

            while (dummy != null) {
                int number = Integer.parseInt(dummy);
                bt.insert(number);
                dummy = bufferedReader.readLine();
            }
            /*
            boolean flag = true;
            while(flag) {
                System.out.println("-visita Anticipata\n-visita Posticipata\n-visita Simmetrica\n" +
                "-Quit\n-Find\n-Rimuovi foglie");

                char choice = input.nextLine().charAt(0);
                switch (choice) {
                    case 'A':
                        bt.visitaAnticipata();
                        break;
                    case 'P':
                        bt.visitaPosticipata();
                        break;
                    case 'S':
                        bt.visitaSimmetrica();
                        break;
                    case 'Q':
                        flag = false;
                        break;
                    case 'R':
                        bt.removeLeaf();
                        break;
                    case 'F':
                        System.out.print("Inserisci il valore da cercare: ");
                        int value;
                        try {
                            value = input.nextInt();
                        } catch (Exception e) {
                            System.out.println("Inserisci un valore valido\n\n\n\n\n");
                            break;
                        }
                        System.out.println(bt.find(value));
                        break;
                    default:
                        System.out.println("Opzione non valida\n\n\n");
                }
            }*/

            bt.visitaSimmetrica();
            System.out.println();
            BinaryTree left = bt.leftTree();
            bt.print2D();
            left.print2D();
            input.close();
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Impossibile aprire il file");
        }
    }
}

/* caricare un albero da un file txt
    Stabilire se è maggiore la somma delle foglie di sinistra o quella di destra o se sono uguali
* */