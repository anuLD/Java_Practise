package implementations;

public class QueueLinkedListImpl {
    Node front;
    Node rear;

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    QueueLinkedListImpl()
    {
        this.front=null;
        this.rear=null;
    }

    public void enQueue(int data)
    {
        Node currentNode=new Node(data);
        if(this.rear==null)
        {
            this.front=this.rear=currentNode;
            return;
        }
        this.rear.next=currentNode;
        this.rear=currentNode;
    }
    public void deQueue()
    {
        if(this.front==null)
        {
            System.out.println("Queue empty");
            return;
        }
       Node temp=this.front;
        this.front=this.front.next;
        if(this.front==null)
            this.rear=null;
    }

}
