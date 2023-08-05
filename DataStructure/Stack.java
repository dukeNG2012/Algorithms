public class Stack{
    static class node
{
    int data;
    node next;
    node(int d)
    {
        data = d;
        next = null;
    }
};

static class stack
{
    node top;
    stack()
    {
        top = null;
    }
    void push(int d)
    {
        node newnode = new node(d);
        newnode.data = d;
        //newnode->next = NULL;
        if(top == null)
        {
            top = newnode;
            return;
        }
        newnode.next = top;
        top = newnode;
    }
    void pop()
    {
        if(top == null)
        {
            System.out.println("Invalid to pop");
        }
        
        top = top.next;
            
    }
    void print()
    {
        node temp = top;
        while(temp != null)
        {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
};



public static void main(String[] args)
{
    stack s = new stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.print();
    s.pop();
    s.print();
    
}
}   



