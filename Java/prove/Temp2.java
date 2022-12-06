import java.util.Random;

class Temp2{
    public static void main(String[] args){
        Random rand = new Random();
        int[][] matrice = new int[10][10];
        

        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice[0].length;j++){
               matrice[i][j]=rand.nextInt(100);
           }
        }


        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice[0].length;j++){
               System.out.format("%3d",matrice[i][j]);
           }
           System.out.println();
        }
        System.out.println('\n');
        
        int temp;
        for(int i=0;i<matrice.length-1;i++){
            if(i%2==0){
                for(int j=0;j<matrice[0].length;j++){
                    temp=matrice[i][j];
                    matrice[i][j]=matrice[i+1][j];
                    matrice[i+1][j]=temp;
                }
            }
        }


        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice[0].length;j++){
                System.out.format("%3d",matrice[i][j]);
           }
           System.out.println();
        }

    }
}
