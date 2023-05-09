public class Main {
    public static void main(String[] args) {
        int personeMassime = 3;
        int personeTotali = 10000;

        Semaphore semaphore = new Semaphore(personeMassime);
        Persona T;
        for(int i = 0; i < personeTotali; i++) {
            T = new Persona(semaphore);
            T.setName(Integer.toString(i+1));
            T.start();
        }
    }
}