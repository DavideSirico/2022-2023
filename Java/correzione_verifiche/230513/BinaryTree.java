import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

public class BinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root; // radice dell'albero
    public BinaryTree() {
        root = null;
    }
    public void insertFile(String filename) { // Metodo per leggere i dati da un file e inserirli nell'albero binario
		try{
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line;
            if((line = in.readLine()) == null){
                System.out.println("Errore file vuoto");
                System.exit(0);
            }
            do{
                insert(Integer.parseInt(line));
            }while((line = in.readLine()) != null);
        }catch(FileNotFoundException ex){
            System.out.println("Errore apertura file (File non trovato)");
            System.exit(0);
        }catch(IOException ex){
            System.out.println("Errore lettura file");
            System.exit(0);
        }
    }
    
    private void printNode(Node node, String prefix, boolean isTail) { // Metodo per stampare un nodo dell'albero in
                                                                       // modo ricorsivo
        if (node == null) { // Se il nodo è nullo, esce dal metodo
            return;
        }
        if (node.right != null) { // Se il nodo ha un figlio destro, chiama il metodo printNode per stampare il
                                  // figlio destro
            printNode(node.right, prefix + (isTail ? "|   " : "    "), false);
        }
        System.out.print(prefix); // Stampa il prefisso
        System.out.print(isTail ? "|-- " : "|-- "); // Stampa il carattere di connessione
        System.out.println(node.data); // Stampa il valore del nodo
        if (node.left != null) { // Se il nodo ha un figlio sinistro, chiama il metodo printNode per stampare il
                                 // figlio sinistro
            printNode(node.left, prefix + (isTail ? "    " : "|   "), true);
        }
    }
    public void print() { // Metodo per stampare l'albero in formato testuale
        printNode(root, "", true); // Chiama il metodo printNode per stampare il nodo radice dell'albero
    }
    
    public void insert(int value) {
		root = insert(root, value);
    }
    
    private Node insert(Node node, int value) {
		if(node == null) {
			return new Node(value);
		}
		if(value < node.data) {
			node.left = insert(node.left, value);
		} else {
			node.right = insert(node.right, value);
		}
		return node;
	}
	
	// 1> (0,75p) int sommaFoglie() - restituisce la somma di tutte le foglie
	public int sommaFoglie() {
		return sommaFoglie(root, 0);
	}
	private int sommaFoglie(Node node, int somma) {
		if(node == null) {
			return somma;
		}
		if(node.left == null && node.right == null) {
			return somma+node.data;
		}
		int somma1 = sommaFoglie(node.left, somma);
		int somma2 = sommaFoglie(node.right, somma);
		return somma1+somma2;
	}
	
	// 2> (0,75p) cancellaFoglieSinistra() - elimina tutte le foglie alla sx della radice
	public void cancellaFoglieSinistra() {
		root.left = cancellaFoglieSinistra(root.left);
	}
	
	private Node cancellaFoglieSinistra(Node node) {
		if(node == null) {
			return null;
		}
		if(node.left == null && node.right == null) {
			return null;
		}
		node.left = cancellaFoglieSinistra(node.left);
		node.right = cancellaFoglieSinistra(node.right);
		return node;
	}
	
	// 3> (0,75p) int sinistraInside()
	// restituisce 1 se la somma di tutti i nodi (foglie comprese) alla sx della root è uguale al valore di uno dei nodi (foglie comprese) alla dx della root,
	// altrimenti restituisce 0.
	public boolean sinistraInside() {
		int sommaLeft = somma(root.left,0);
		return sinistraInside(root.right, sommaLeft);
	}
	private int somma(Node node,int sommaTot) {
		if(node == null) {
			return sommaTot;
		}
		
		int somma1 = somma(node.left, sommaTot);
		int somma2 = somma(node.right, sommaTot);
		
		return somma1+somma2+node.data;
	}
	
	private boolean sinistraInside(Node node, int somma) {
		if(node == null) {
			return false;
		}
		if(node.data == somma) {
			return true;
		}
		if(somma < node.data) {
			return sinistraInside(node.left, somma);
		} else {
			return sinistraInside(node.right, somma);
		}
	}
	
	// 4> (0,75p) int alberoDue() - restituisce 1 se i tutti i nodi o sono foglie o hanno 2 figli, altrimenti restituisce 0.
	public boolean alberoDue() {
		return alberoDue(root);
	}
	
	private boolean alberoDue(Node node) {
		if(node == null) {
			return true;
		}
		boolean flagFoglia = false;
		boolean flagDueFigli = false;
		if(node.left == null && node.right == null) {
			flagFoglia = true;
		}
		if(node.left != null && node.right != null) {
			flagDueFigli = true;
		}
		boolean flag1 = alberoDue(node.left);
		boolean flag2 = alberoDue(node.right);
		return flag1 && flag2 && (flagFoglia || flagDueFigli);
	}
}

