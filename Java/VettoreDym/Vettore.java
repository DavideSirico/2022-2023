class Vettore
{
    private int v[];
    private int c;
    public Vettore(int n)
    {
        v = new int[n];
        c = 0;
    }
    public void aggiungi(int n)
    {
        v[c] = n;
        c++;
    }
    public void sort()
    {
        int temp;
        for(int i = 0; i < c - 1; i++)
        {
            for(int j = i + 1; j < c; j++)
            {
                if(v[i]>v[j])
                {
                    temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
    }
    public void stampa()
    {
        for(int i = 0; i < c; i++)
        {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
