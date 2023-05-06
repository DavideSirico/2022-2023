package pkg230417_b.tree.pdf;

public class TreePdf
{
    public static void main(String[] args)
    {
        BinaryTree bt1 = new BinaryTree(5);
        bt1.insert(0);
        bt1.insert(1);
        bt1.insert(2);
        bt1.insert(3);
        bt1.insert(4);
        bt1.insert(6);
        bt1.insert(7);
        bt1.insert(8);
        bt1.insert(9);
        
        System.out.println("Depth: " + bt1.getMaxDepth());
        System.out.println("Altezza: " + bt1.getDepth(1));
    }
}
// a partire da un albero formare un altro albero senza le foglie