public class BinaryTree {
    static class node
    {
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data = data;
        }
    }
    static node insert(int data, node root)
    {
        if(root == null)
        {
            root = new node(data);
    
            return root;
        }
        if(data < root.data)
        {
            root.left = insert(data, root.left);
        }
        if(data >= root.data)
        {
            root.right = insert(data, root.right);
        }
        return root;
    }
    static void MiddlePrint(node root)
    {
        if(root == null)
        {
            return;
        }
        MiddlePrint(root.left);
        System.out.println(root.data + " ");
        MiddlePrint(root.right);
    }
    public static void main(String[] args)
    {
        node h = new node(1);
        insert(0, h);
        insert(-1,h);
        MiddlePrint(h);
    }
}
