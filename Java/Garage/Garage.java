import java.util.Scanner;

class Garage
{
    private float costoMinimo;
    public Auto[] auto; 
    Garage(int DIM)
    {
        Scanner input = new Scanner(System.in);
        auto = new Auto[DIM];
        for(int i = 0; i < DIM; i++)
        {
            String marca,modello;
            int cilindrata;
            float costo;
            boolean manuale;
            System.out.print("Marca: ");
            marca = input.nextLine();
            System.out.print("Modello: ");
            modello = input.nextLine();
            System.out.print("Cilindrata: ");
            cilindrata = input.nextInt();
            System.out.print("Costo: ");
            costo = input.nextFloat();
            System.out.print("Manuale: ");
            manuale = input.nextBoolean();
            auto[i] = new Auto(marca,modello,cilindrata,costo,manuale);
        }
        costoMinimo = 0;
    }
    public float getCostoMinimo()
    {
        float costoMin = auto[0].getCosto();
        for(int i = 1; i < auto.length; i++)
        {
            if(costoMin>auto[i].getCosto())
            {
                costoMin = auto[i].getCosto();
            }
        }
        return costoMin;
    }

}
