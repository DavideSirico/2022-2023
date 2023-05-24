public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertFile("numeri.txt");
        bt.print();
        System.out.println();
		
		
		// 1> (0,75p) int sommaFoglie() - restituisce la somma di tutte le foglie
        System.out.println("Somma delle foglie: " + bt.sommaFoglie() + "\n");
        
        // 2> (0,75p) cancellaFoglieSinistra() - elimina tutte le foglie alla sx della radice
        bt.cancellaFoglieSinistra();
        bt.print();
        System.out.println("\n");
        
        // 3> (0,75p) int sinistraInside() - restituisce 1 se la somma di tutti i nodi (foglie comprese) alla sx della root è uguale al valore di uno dei nodi (foglie comprese) alla dx della root, altrimenti restituisce 0.
        if(bt.sinistraInside()) {
			System.out.println("Uguale");
		} else { 
			System.out.println("Non uguale");
		}
		System.out.println("\n");
		
		// 4> (0,75p) int alberoDue() - restituisce 1 se i tutti i nodi o sono foglie o hanno 2 figli, altrimenti restituisce 0.
        if(bt.alberoDue()) {
			System.out.println("Tutti nodi con 2 figli o foglie");
		} else { 
			System.out.println("Sono presenti nodi con un solo figlio");
		}
    }
}
