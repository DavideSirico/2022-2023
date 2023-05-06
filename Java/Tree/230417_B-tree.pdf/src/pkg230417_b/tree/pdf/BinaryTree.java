package pkg230417_b.tree.pdf;

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
    BinaryTree()
    {
        root = new Node(0);
    }
    BinaryTree(int x)
    {
        root = new Node(x);
    }
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
    public int getMaxDepth()
    {
        return getMaxDepth(root);
    }
    private int getMaxDepth(Node node)
    {
        if(node==null)
        {
            return 0;
        } else {
            int leftDepth = getMaxDepth(node.left);
            int rightDepth = getMaxDepth(node.right);
            
            if(leftDepth>rightDepth)
            {
                return leftDepth+1;
            } else {
                return rightDepth+1;
            }
            
        }
        
    }
    
    public int getDepth(int x)
    {
        return getDepth(root, x);
    }
    
    private int getDepth(Node node,int x)
    {
        if(node == null)
        {
            return -1;
        }
        /*
        if(node.value == x)
        {
            int leftDist = getDepth(node.left,x);
            int rightDist = getDepth(node.right,x);
            if(leftDist>=0 || rightDist>=0)
            {
               return rightDist+1;
            }
        }
        
        return -1;
        */
        int dist = -1;
        if((node.value == x) || (dist = getDepth(node.left,x))>=0 || (dist = getDepth(node.right,x))>=0)
        {
            return dist+1;
        }
        return dist;
    }
    
    public int getMax()
    {
        return getMax(root);
    }
    private int getMax(Node node)
    {
        if(node == null)
        {
            return -1;
        }
        
    }
}

