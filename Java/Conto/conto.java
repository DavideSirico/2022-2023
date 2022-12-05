class conto{
    private int numero;
    private String correntista; 
    private double saldo;
    public static void main(String[] args){
        conto contoJim = new conto();
        contoJim.deposito(100);
        System.out.println(contoJim);
    }
    conto(){
        numero = 0;
        correntista = "";
        saldo = 0;
    }
    public void create(int numero, String correntista, double saldo){
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }
    public void deposito(int N){
        saldo = saldo + N;
    }
    public void prelievo(int N){
        saldo = saldo - N;
        if(saldo<0){
            System.out.println("Non è possibile prelevare");
            saldo = 0;
        }
    }
}
