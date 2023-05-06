package nb_thread8;
import java.util.ArrayList;

public class Prime implements Runnable{
    private int start;
    private int end;

    private ArrayList<Integer> primes;

    public Prime(int start, int end){
        this.start = start;
        this.end = end;
        primes = new ArrayList<Integer>();
    }

    @Override
    public void run() {
        for(int i = start; i < end; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
    }
    private boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for(int i = 2; i < n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public int getNumberOfPrimes(){
        return primes.size();
    }

    public ArrayList<Integer> getPrimes(){
        return primes;
    }

}
