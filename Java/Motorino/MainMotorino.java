class MainMotorino
{
    public static void main(String[] args)
    {
        Motorino m1 = new Motorino("rosso","“Piaggio scarabeo”, ",50);
        Motorino m2 = new Motorino("rosso","Ape",10);
        m1.accelera(5);
        System.out.println(m1.getVelocita());
        m2.inserisciAntifurto();
        m2.accelera(2);
        System.out.println(m2.getVelocita());
    }
}