import java.util.Random;

class Reverse{
    public static void main(String[] args){
        int[] vettore = new int[10];
        Random rand = new Random();

        int temp;

        for(int i=0;i<vettore.length;i++){
            vettore[i]=rand.nextInt(100);
        }

        for(int i=0;i<vettore.length;i++){
            System.out.print(vettore[i] + " ");
        }
        System.out.println();

        for(int i=0;i<(vettore.length)/2;i++){
            temp=vettore[i];
            vettore[i]=vettore[vettore.length-1-i];
            vettore[vettore.length-1-i]=temp;
        }

        for(int i=0;i<vettore.length;i++){
            System.out.print(vettore[i] + " ");
        }
        System.out.println();

    }
}
