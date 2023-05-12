
public class BinaryTree {
    static final int COUNT = 7;

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            }
        }
    public Node root;
    public BinaryTree(){
        root=null;
    }
    public void insert(int value) {
        root = insert(root,value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        } else {
            return node;
        }
        return node;
    }

    public void visitaAnticipata() {
        visitaAnticipata(root);
    }
    private void visitaAnticipata(Node node) {
        if(node != null)
        {
            System.out.println(node.data);
            visitaAnticipata(node.left);
            visitaAnticipata(node.right);
        }
    }

    public void visitaPosticipata() {
        visitaPosticipata(root);
    }
    private void visitaPosticipata(Node node) {
        if(node != null)
        {
            visitaPosticipata(node.left);
            visitaPosticipata(node.right);
            System.out.println(node.data);
        }
    }
    public void visitaSimmetrica() {
        visitaSimmetrica(root);
    }
    private void visitaSimmetrica(Node node) {
        if(node != null) {
            visitaSimmetrica(node.left);
            System.out.println(node.data);
            visitaSimmetrica(node.right);
        }
    }

    public void removeLeaf() {
        root = removeLeaf(root);
    }

    private Node removeLeaf(Node node) {
        if(node == null) {
            return null;
        }
        if(node.left == null && node.right == null) {
            return null;
        }
        node.left = removeLeaf(node.left);
        node.right = removeLeaf(node.right);
        return node;
    }

    public boolean find(int value) {
        return find(root, value);
    }
    private boolean find(Node node, int value) {
        if(node == null) {
            return false;
        }
        if(node.data == value) {
            return true;
        }
        if(node.data > value) {
            return find(node.left, value);
        } else {
            return find(node.right, value);
        }
    }
    /*
    public void print() {
        print(root, 1);
    }

    private void print(Node node, int height) {
        if(node != null) {
            System.out.println(node.data);
            for(int i = 0; i < height-1; i++) {
                System.out.print("├──");
            }
            System.out.print("├──");
            print(node.left,height+1);
            print(node.right,height+1);
        }
    }
    */
    public void minMaxLeaf() {
        int left = minMaxLeaf(root.left,0);
        int right = minMaxLeaf(root.right,0);
        if(left > right) {
            System.out.println("La somma delle foglie del ramo di sinistra è maggiore");
        } else if(left < right) {
            System.out.println("La somma delle foglie del ramo di destra è maggiore");
        } else {
            System.out.println("La somma delle foglie del ramo di destra è uguale a quella del ramo di sinistra");
        }

    }



    private int minMaxLeaf(Node node, int somma) {
        if(node == null) {
            return somma;
        }
        if(node.left == null && node.right == null) {
            somma += node.data;
            return somma;
        }
        int sommaLeft = minMaxLeaf(node.left, somma);
        int sommaRight = minMaxLeaf(node.right, somma);
        return sommaLeft + sommaRight;
    }
    /*
    dato un albero restituire un sotto albero formato solo dai nodi di sinistra
    */
    public BinaryTree leftTree() {
        BinaryTree left = new BinaryTree();
        left.root = leftTree(root);
        return left;
    }
    private Node leftTree(Node node) {
        if(node == null) {
            return null;
        }
        if(node.left == null && node.right == null) {
            return node;
        }
        Node left = new Node(node.data);
        left.left = leftTree(node.left);
        left.right = null;
        return left;
    }

    private void print2DUtil(Node root, int space)
    {
        if (root == null)
            return;

        space += COUNT;
        print2DUtil(root.right, space);

        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");

        print2DUtil(root.left, space);
    }

    public void print2D()
    {
        print2DUtil(root, 0);
    }

}