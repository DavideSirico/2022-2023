import java.util.Scanner;
import java.util.Random;
class Sorting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int dim=-1;
        try{
            dim = input.nextInt();
        } catch(Exception e){
            System.out.println("Inserire un numero positivo");
            System.exit(1);
        }

        int[] vettore = new int[dim];
        
        for(int i=0;i<vettore.length;i++){
            vettore[i]=rand.nextInt(100);
        }

        for(int i=0;i<vettore.length;i++){
            System.out.print(vettore[i] + " ");
        }
        System.out.println();
        
        for(int i=0;i<vettore.length;i++){
            for(int j=i+1;j<vettore.length;j++){
                if(vettore[i]>vettore[j]){
                    int temp = vettore[i];
                    vettore[i]=vettore[j];
                    vettore[j]=temp;
                }
            }
        }

        for(int i=0;i<vettore.length;i++){
            System.out.print(vettore[i] + " ");
        }
        System.out.println();
         
    }
}
