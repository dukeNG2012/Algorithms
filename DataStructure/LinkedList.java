import javax.swing.text.Position;

class LinkedList
{
    static class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data = data;
        }
        
    }
    
    static void Insert(node head, int data, int position)
    {
        node newnode = new node(data);
        if (position == 0)
        {
            newnode.next = head;
            head = newnode;
            return;
        }
        if(head == null)
        {
            newnode.next = head;
            head = newnode;
            
            return;
        } 
        node temp = head;
        for(int i = 0; i < position-1; ++i)
        {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    static void Delete(node head,int position)
    {
        node temp = head;
        if(position == 0)
        {
            head = head.next;
            return;
        }
        for(int i = 0; i < position-1; ++i)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }
    
    static void print(node head)
    {
        node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    static void ReverseLinkedList(node head)
    {
        node next = null;
        node prev = null;
        node current = head;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            // move pointer
            prev = current;
            current = next;
        }
        // after some time previous will be in the last position
        head = prev;
        
    }
    
    public static void main(String[] args)
    {
        node h = new node(3);
        Insert(h,1,1);
        Insert(h,8,2);
        Insert(h,2,3);
        Insert(h, 5, 4);
        //ReverseLinkedList(h);
        
        print(h);

    }
}