import java.util.Scanner;
import java.util.Random;

class Temp{
	public static void main(String[] args){
        if(args.length!=1){
            System.out.println("Usage: java Temp <number>");
            System.exit(1);
        }

        try{
            Integer.valueOf(args[0]).intValue();
        }catch(Exception e){
            System.out.println("Usage: java Temp <number>");
            System.exit(1);
        }

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[][] matrice = new int[10][5];


        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice[0].length;j++){
                matrice[i][j]=rand.nextInt(5);
            }
        }

        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice[0].length;j++){
                System.out.format("%3d",matrice[i][j]);
            }
            System.out.println();
        }
        input.close();
	}
}				
