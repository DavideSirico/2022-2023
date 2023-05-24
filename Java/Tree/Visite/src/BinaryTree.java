import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

public class BinaryTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
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
                return;
            }
            do{
                insert(Integer.parseInt(line));
            }while((line = in.readLine()) != null);
        }catch(FileNotFoundException ex){
            System.out.println("Errore apertura file (File non trovato)");
        }catch(IOException ex){
            System.out.println("Errore lettura file");
        }
    }

    private void printNode(Node node, String prefix, boolean isTail) { // Metodo per stampare un nodo dell'albero in
        // modo ricorsivo
        if (node == null) { // Se il nodo è nullo, esce dal metodo
            return;
        }
        if (node.right != null) { // Se il nodo ha un figlio destro, chiama il metodo printNode per stampare il
            // figlio destro
            printNode(node.right, prefix + (isTail ? "│   " : "    "), false);
        }
        System.out.print(prefix); // Stampa il prefisso
        System.out.print(isTail ? "└── " : "┌── "); // Stampa il carattere di connessione
        System.out.println(node.val); // Stampa il valore del nodo
        if (node.left != null) { // Se il nodo ha un figlio sinistro, chiama il metodo printNode per stampare il
            // figlio sinistro
            printNode(node.left, prefix + (isTail ? "    " : "│   "), true);
        }
    }

    public void print() { // Metodo per stampare l'albero in formato testuale
        printNode(root, "", true); // Chiama il metodo printNode per stampare il nodo radice dell'albero
    }
    public void insert(int value) {
        root = insert(root,value);
    }
    private Node insert(Node node,int value) {
        if(node == null) {
            return new Node(value);
        }
        if(value < node.val) {
            node.left = insert(node.left,value);
        } else {
            node.right = insert(node.right,value);
        }
        return node;
    }
    public int getDepth() {
        return getDepth(root,0);
    }
    private int getDepth(Node node, int depth) {
        if(node == null) {
            return depth;
        }
        depth++;
        int max1 = getDepth(node.left,depth);
        int max2 = getDepth(node.right,depth);
        if(max1 > max2) {
            return max1;
        }
        return max2;
    }
    public void delete(int value) {
        root = delete(root, value);
    }
    private Node delete(Node node, int value) {
        if(node == null) {
            return null;
        }
        if(value < node.val) {
            node.left = delete(node.left,value);
        } else if(value > node.val) {
            node.right = delete(node.right,value);
        } else {
            if(node.right == null) {
                return node.left;
            }
            if(node.left == null) {
                return node.right;
            }
            node.val = minVal(node.right);
            node.right = delete(node.right, node.val);
        }
        return node;
    }
    private int minVal(Node node) {
        int minv = node.val;
        while(node.left != null) {
            minv = node.left.val;
            node = node.left;
        }
        return minv;
    }
}

// imparare a memoria
// insert
// find
// delete
// le visite
// removeLeaves

