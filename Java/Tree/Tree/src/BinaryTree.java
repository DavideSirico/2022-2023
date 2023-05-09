class Node {
    int value;
    Node left;
    Node right;
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

class BinaryTree {
    Node root;
    private int depth;
    private boolean search(Node nodo, int value)
    {
        if(nodo.value == value)
        {
            return true;
        }
        if(nodo.left != null && search(nodo.left,value))
        {
            return true;
        }
        if(nodo.right != null && search(nodo.right,value))
        {
            return true;
        }
        return false;
    }
    public boolean search(int value)
    {
        return search(root,value);
    }

    private Node remove (Node node, int value) {
        if (value == node.value) {

            // node with only one child or no child
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            // node.value = minValue(node.right);

            // Delete the inorder successor
            node.right = remove(node.right, node.value);
        } else {

        }
        return node;
    }

    private int valorePiuPiccolo(Node node)
    {
        if (node.left == null)
            return node.value;
        return valorePiuPiccolo(node.left);
    }

    public void remove(int value)
    {
        root = remove(root,value);
    }

    public void removeLeafs()
    {
        root = removeLeafs(root);
    }

    private Node removeLeafs(Node node)
    {
        if (node == null) {
            return null;
        }
        if (node.left == null && node.right == null) {
            return null;
        }

        node.left = removeLeafs(node.left);
        node.right = removeLeafs(node.right);

        return node;
    }

    private boolean isLeaf(Node node)
    {
        if(node.left == null && node.right == null)
        {
            return true;
        }
        return false;
    }
    private Node insert(Node current, int value)
    {
        if (current == null)
        {
            return new Node(value);
        }

        if (value < current.value)
        {
            current.left = insert(current.left, value);
        } else if (value > current.value)
        {
            current.right = insert(current.right, value);
        } else
        {
            return current;
        }
        return current;
    }

    public void insert(int value) {
        root = insert(root, value);
    }
    private void inOrdine(Node nodo)
    {
        if(nodo != null)
        {
            inOrdine(nodo.left);
            System.out.print(nodo.value + " ");
            inOrdine(nodo.right);
        }
    }
    private void preOrdine(Node nodo)
    {
        if(nodo != null)
        {
            System.out.print(nodo.value + " ");
            preOrdine(nodo.left);
            preOrdine(nodo.right);
        }
    }
    private void postOrdine(Node nodo)
    {
        if(nodo != null)
        {
            postOrdine(nodo.left);
            postOrdine(nodo.right);
            System.out.print(nodo.value + " ");
        }
    }
    public void inOrdine()
    {
        inOrdine(root);
        System.out.println();
    }
    public void preOrdine()
    {
        preOrdine(root);
        System.out.println();
    }
    public void postOrdine()
    {
        postOrdine(root);
        System.out.println();
    }
    private int getLongestNumber()
    {
        return -1;
    }
    public void getMaxDepth()
    {
        getMaxDepth(root,1);
    }
    private void getMaxDepth(Node node, int current)
    {
        if(node != null) {

            if (node.left == null && node.right == null) {
                current = 1;
            } else {
                current = current + 1;
                if (current > depth) {
                    depth = current;
                }
            }
            getMaxDepth(node.left, current);
            getMaxDepth(node.right, current);
        }
    }

    static void print2DUtil(Node root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    static void print2D(Node root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }

}


/*
if(value < node.value) {
    node.left = remove(node.left,value);
} else {
    node.right = remove(node.right, value);
}
*/