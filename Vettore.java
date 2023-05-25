import java.util.*;

public class Vettore {

    public static void main(String[] args) {
        int i,j,k,ctr,flag,DIM = 11;
        int[] v1 = {1,2,3,4,1,10,1,8,7,6,5};
        //int [] v1 = new int[DIM];
        int[] pos = new int[DIM];
        //Random rand = new Random();
        for(i=0;i<DIM;i++){
            //v1[i] = rand.nextInt(10);
            pos[i] = -1;
        }
        ctr = 0;
        flag = 1;
        for(i=0;i<DIM;i++){
            for(j=0;j<DIM;j++){
                for(k=0;k<ctr;k++){
                    if(i==pos[k]){
                        flag = 0;
                    }
                }
                if(i!=j){
                    if(v1[i]==v1[j] && flag!=0){
                        pos[ctr]=j;
                        ctr++;
                    }
                }
                flag = 1;
            }
        }
        

        int[] v2 = new int[DIM-ctr];
        k = 0;
        flag = 1;
        for(i=0;i<DIM;i++){
            for(j=0;j<DIM;j++){
                if(i==pos[j]){
                    flag = 0;
                }
            }
            if(flag==1){
                v2[k] = v1[i];
                k++;
            }
            flag = 1;
        }




        for(i=0;i<DIM;i++){
            System.out.print(v1[i]+" ");
        }

        System.out.println("\n");
        for(i=0;i<v2.length;i++){
            System.out.print(v2[i]+" ");
        }

        System.out.println("\n");
        int c,maxctr1,maxctr2,pos1Crescente,pos2Crescente,pos1Decrescente,pos2Decrescente;
        maxctr1 = 0;
        c = 1;
	    pos1Crescente = pos2Crescente = 0;
        for(i=0;i<v2.length-1;i++){
            if(v2[i]==v2[i+1]+1){
		        c++;
            }else
            {
                if(c>maxctr1){
                    maxctr1 = c;
                    pos2Crescente=i+1;
                    pos1Crescente = i-(maxctr1-1);
		        }
                c = 1;
            }
			
        }
        if(c>maxctr1){
            maxctr1 = c;
            pos1Crescente = i-(maxctr1-1);
            pos2Crescente = v2.length;
        }
            
        maxctr2 = 0;
        c = 1;
        pos1Decrescente = pos2Decrescente = 0;
        for(i=0;i<v2.length-1;i++){
            if(v2[i]==v2[i+1]-1){
		        c++;
            }else
            {
                if(c>maxctr2){
                    maxctr2 = c;
                    pos2Decrescente=i+1;
                    pos1Decrescente = i-(maxctr2-1);
                }
                c = 1;
            }
	    }
        if(c>maxctr2){
            maxctr2 = c;
            pos1Decrescente = i+1;
            pos2Decrescente = v2.length;
        }


        if(maxctr1>maxctr2){
            for(i=pos1Crescente;i<pos2Crescente;i++){
                System.out.print(v2[i]+" ");
            } 
        }else
        {
            for(i=pos1Decrescente;i<pos2Decrescente;i++){
                System.out.print(v2[i]+" ");
            }
        }
    }
}