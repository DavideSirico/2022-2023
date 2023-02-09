package counter;
public class Counter implements Comparable{
    private int val;
    public Counter()
    {
        val = 0;
    }
    public Counter(int v)
    {
        val = v;
    }
    public void inc()
    {
        val++;
    }
    public int getValue()
    {
        return val;
    }

    @Override
    public String toString() {
        return "Counter{" + "val=" + val + '}';
    }

    @Override
    public int compareTo(Object t) {
        Counter temp = (Counter)t; 
        if(temp.val<this.val)
        {
            return 1;
        }
        if(temp.val==this.val)
        {
            return 0;
        }
        return -1;
    }
    
}
