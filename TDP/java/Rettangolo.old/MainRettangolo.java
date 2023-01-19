class MainRettangolo{
    public static void main(String[] args){
        Rettangolo rett1,rett2,rett3;
        rett1 = new Rettangolo();
        rett2 = new Rettangolo(4,5);
        rett3 = new Rettangolo(4,5);
        rett1.setBase(10);
        rett1.setAltezza(2);

        rett3.setBase(50);

        System.out.println("Area rettangolo 1=" + rett1.getArea());
        System.out.println("Area rettangolo 2=" + rett2.getArea());
        System.out.println("Area rettangolo 3=" + rett3.getArea() + "\n");

        System.out.println("Perimetro rettangolo 1=" + rett1.getPerimetro());
        System.out.println("Perimetro rettangolo 2=" + rett2.getPerimetro());
        System.out.println("Perimetro rettangolo 3=" + rett3.getPerimetro() + "\n");
    }
}
