package main;
/*
Implementare un algoritmo per eliminare tutti i duplicati di un array. Per esempio, l'array Vettore1
    4  5  11  4  8  5  11  7  8  6  5
dovrebbe essere modificato in Vettore2
   4  5  11  8  7  6
Visualizzate i due array.
(NB: deve essere mantenuto l'ordine di Vettore1)

Visualizzare la sequenza di numeri consecutivi crescente o decrescente più lunga di Vettore 2
output: 8  7  6
*/
public class Main {
    public static void main(String[] args) {
        int DIM = 11;
        int[] v = new int[DIM];
        for(int i = 0; i < DIM; i++)
        {
            v[i] = r.nextInt(5);
            System.out.print(v[i] + " ");
        }
        System.out.println("\n");
        int dim = DIM;
        int dimPos = 0;
        int[] vpos = new int[DIM];
        
        // imposto tutti gli elementi di vpos con -1 (la i non puo mai essere -1)
        for(int i = 0; i < DIM; i++)
        {
            vpos[i] = -1;
        }
        // trovo la posizione degli elementi che devo eliminare
        int counter = 0;
        for(int i = 0; i < DIM-1; i++)
        {
            for(int j = i + 1; j < DIM; j++)
            {
                int flag = 0;
                for(int k = 0; k < dimPos; k++)
                {
                    if(i == vpos[k])
                    {
                        flag = 1;
                    }
                }
                if(v[i]==v[j] && flag != 1)
                {
                    vpos[counter] = j;
                    counter++;
                    dimPos++;
                    dim--;
                }
            }
        }
        // vettore2
        int[] vFinale = new int[dim];
        // inserisco gli elementi non duplicati in vFinale
        int c = 0;
        for(int i = 0; i < DIM; i++)
        {
            int flag = 0;
            for(int j = 0; j < dimPos; j++)
            {
                if(i == vpos[j])
                {
                    flag = 1;
                }
            }
            if(flag != 1)
            {
                vFinale[c] = v[i];
                c++;
            }
        }
        // visualizzo vFinale
        for(int i = 0; i < dim; i++)
        {
            System.out.print(vFinale[i] + " ");
        }
        System.out.println("\n");
        // trovo la sequenza crescente maggiore e la sequenza decrescente maggiore
        int iInizio;
        int iInizioMaxCrescente = 0;
        int iInizioMaxDecrescente = 0;
        int ctr;
        int ctrMaxCrescente = 1;
        int ctrMaxDecrescente = 1;
        for(int i = 0; i < dim-1; i++)
        {
            ctr = 1;
            iInizio = i;
            while(i < dim-1 && vFinale[i]==vFinale[i+1]-1)
            {
                ctr++;
                i++;
            }
            if(ctr>ctrMaxCrescente)
            {
                ctrMaxCrescente = ctr;
                iInizioMaxCrescente = iInizio;
            }
        }
        for(int i = 0; i < dim-1; i++)
        {
            ctr = 1;
            iInizio = i;
            while(i < dim-1 && vFinale[i]==vFinale[i+1]+1)
            {
                ctr++;
                i++;
            }
            if(ctr>ctrMaxDecrescente)
            {
                ctrMaxDecrescente = ctr;
                iInizioMaxDecrescente = iInizio;
            }
        }
        // in base alla sequenza più lunga la visualizzo
        if(ctrMaxDecrescente>ctrMaxCrescente)
        {
            for(int i = 0; i < ctrMaxDecrescente; i++)
            {
                System.out.print(vFinale[iInizioMaxDecrescente+i] + " ");
            }
        } else 
        {
           for(int i = 0; i < ctrMaxCrescente; i++)
            {
                System.out.print(vFinale[iInizioMaxCrescente+i] + " ");
            } 
        }
        
    }
}
