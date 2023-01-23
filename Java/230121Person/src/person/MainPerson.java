package person;
public class MainPerson {
    public static void main(String[] args) {
        Person p = new Person("Davide",050204);
        System.out.println("Nome: " + p.getName());
        System.out.println("E' il suo compleanno? " + p.isBirthday(050204));
        System.out.println();
        
        Lavoratore l = new Lavoratore("El Primo",050204, 15);
        System.out.println("Nome: " + l.getName());
        System.out.println("Stipendio: " + l.getStipendio());
        
    }
}
