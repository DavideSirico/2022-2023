package animale;
public class Mammifero extends Animale{
    @Override
    public void mangiare()
    {
        System.out.println("Il mammifero sta mangiando");
    }
    @Override
    public void dormire()
    {
        System.out.println("Il mammifero sta dormendo");
    }
}
