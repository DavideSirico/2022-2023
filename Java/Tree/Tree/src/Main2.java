
public class Main2
{
    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();

        bt.insert(5);
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(6);
        bt.insert(7);
        bt.insert(8);
        bt.insert(9);

        bt.inOrdine();

        bt.removeLeafs();
        bt.inOrdine();
    }
}
