import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner input = new Scanner(System.in);
            String dummy = bufferedReader.readLine();
            if (dummy == null) {
                System.out.println("File vuoto");
                return;
            }

            BinaryTree bt = new BinaryTree();

            while (dummy != null) {
                int number = Integer.parseInt(dummy);
                System.out.println(number);
                bt.insert(number);
                dummy = bufferedReader.readLine();
            }

            /*
            boolean flag = true;
            while(flag) {
                System.out.println("'A' 'P' 'S' ('Q'): ");
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
                    default:
                        System.out.println("Opzione non valida");
                }
            }*/
            bt.visitaSimmetrica();
            System.out.println(bt.find(10));

            input.close();
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Impossibile aprire il file");
        }
    }
}