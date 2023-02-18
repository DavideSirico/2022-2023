public class test
{
    public static void main(String[] args)
    {
        int i,j,ctr,maxctr = 0;
        String s = "";

        String[] str = {"Mantova","Cremona","Cremona","Mantova","Cremona"};
        int DIM = str.length;
        for(i=0;i<DIM;i++){
            ctr = 0;
            for(j=0;j<DIM;j++){
                if(str[i]==str[j]){
                    ctr++;
                }
            }
            if(ctr>maxctr){
                maxctr = ctr;
                s = str[i];
            }
        }
        System.out.println("La citta' con piu' stagisti e' "+s+" con "+maxctr+" stagisti");
    }
}
