package implementations;

public class StackLinkedListImpl {

    StackNode head;

    class StackNode
    {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data=data;
            next=null;
        }
    }

    void push(int d)
    {
        StackNode newNode=new StackNode(d);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            StackNode temp=head;
            head=newNode;
            newNode.next=temp;
        }
    }

    int pop()
    {
        int poppedElement=0;
        if(head==null)
        {
            System.out.println("stack undeflow");
            return 0;
        }
        else {
            poppedElement = head.data;
            head = head.next;
        }
        return poppedElement;
    }

    int peek()
    {
        if(head==null)
        {
            return 0;
        }
        else
            return head.data;
    }
}

