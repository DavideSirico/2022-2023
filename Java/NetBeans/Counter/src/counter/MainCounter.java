package counter;
public class MainCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter(5);
        Counter c2 = new Counter(5);
        System.out.println(c1.compareTo(c2));
    }
}
