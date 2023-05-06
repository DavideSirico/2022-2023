public class BinaryTree {
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
    private Node root;
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



}