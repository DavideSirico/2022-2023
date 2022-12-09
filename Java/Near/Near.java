/*
Dato un vettore di 10 interi random[1..100] - tutti diversi fra loro(NB!!!) non ordinati - e un numero intero inserito da tastiera; scrivi un metodo statico che restituisca al programma principale, l'elemento del vettore più vicino al numero inserito , la sua posizione nel vettore e la sua distanza dal numero inserito.*/

import java.util.Random;
import java.util.Scanner;
class Near
{
    public static void main(String[] args)
    {
        int[] v = new int[10];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        boolean flag = true;
        for(int i = 0; i < 10; i++)
        {
            do
            {
                v[i] = rand.nextInt(100)+1;
                flag = false;
                for(int j = 0; j < i; j++)
                {
                    if(v[j] == v[i])
                    {
                        flag = true;
                    }
                }
            }while(flag == true);
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.print(v[i] + " ");
        }
        System.out.print("\nInserire un numero: ");
        int number;
        try
        {
            number = input.nextInt();
        }catch(Exception e)
        {
            System.out.print("Solo numeri");
            return;
        }
        int[] r = new int[3];
        r = vicino(v,number);

        System.out.print("Elemento più vicino: " + r[0] + "\nPosizione dell'elemento più vicino: " + r[1] + "\nDistanza tra n e il numero più vicino: " + r[2]);
    }

    public static int[] vicino(int[] v,int n)
    {
        int[] r = new int[3];
        
        int delta = n - v[0];
        if(delta<0)
        {
            delta = delta * (-1);
        }
        int deltaMin = delta;
        int deltaPos = 0;
        int i;
        for(i = 1; i < v.length; i++)
        {
            delta = n - v[i];
            if(delta<0)
            {
                delta = delta * (-1);
            }
            if(delta<=deltaMin)
            {
                deltaMin = delta;
                deltaPos = i;
            }
        }
        r[0] = v[deltaPos];
        r[1] = deltaPos;
        r[2] = deltaMin;
        return r; 
    }
}
