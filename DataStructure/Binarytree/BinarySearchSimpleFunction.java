
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
    static node Delete(node node, int data)
    {
        if(node == null)
        {
            System.out.println("No data");
        }
        /*
         * có 3 trường hợp khi xóa phần tử ở cây nhị phân tìm kiếm:
         * 1. node lá
         * 2. node có 1 con
         * 3. node có 2 con -> chuyển nó đổi với phần tử trái cùng sau đó thì xếp lại cây
         */
        if(node.data > data)
        {
            node.left = Delete(node.left, data);
        }
        else if(node.data < data)
        {
            node.right = Delete(node.right, data);
        }
        else
        {
            // 0 con:
            if(node.left == null && node.right == null)
            {
                node = null;
            }
            // 1 con ở bên trái:
            else if(node.right == null)
            {
                node temp = node.left;
                node.left = null;
                node = temp; // có nghĩa là trả về phần tử vừa được xóa.
            }
            // 1 con bên phải
            else if(node.left == null)
            {
                node temp = node.right;
                node.right = null;
                node = temp;
            }
            // 2 con 
            else
            {
                node temp = node.right;

                // find left most child in right subtree
                while(temp.left != null)
                {
                    temp = temp.left;
                }
                
                node.data = temp.data;
                // this line find the right sub tree!
                node.right = Delete(node.right, data); 

            }
        }
        return node;
    }
    static boolean Search(node node, int data)
    {
        if(node == null)
        {
            return false;
        }
        if(node.data == data)
        {
            return true;
        }
        if(data < node.data )
        {
            return Search(node.left, data);
        }
        else
        {
            return Search(node.right, data);
        }
    }
    static boolean find(node node,int data)
    {
        if(Search(node, data))
        {
            System.out.println(data + " Is present in given BST");
            return true;
        }
        else
        {
            return false;
        }
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
        insert(2, h);
        insert(-2, h);
        find(h, 0);
        System.out.println(Delete(h, 0));
        MiddlePrint(h);
    }
}
