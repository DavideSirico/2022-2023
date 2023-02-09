package dataentry;
public class DataEntry {
    
    DataEntry()
    {
        
    }
    
    public boolean controllaDati(String dummy)
    {
        char n = '0';
        for(int i = 0; i < 10; i++)
        {
            if(dummy.indexOf(n) != -1)
            {
                return false;
            }
            n = (char) (n + 1);
        }
        return true;
    }
    public boolean controllaDati(int dummy)
    {
        return dummy >= 0;
    }
    
}
