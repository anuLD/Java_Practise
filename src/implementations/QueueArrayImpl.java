package implementations;

public class QueueArrayImpl {

    public int front, rear, capacity;
    public static int queue[];

    QueueArrayImpl(int capacity)
    {
        front=rear=0;
        this.capacity=capacity;
        queue=new int[capacity];
    }

    void queueEnque(int data)
    {
        if(capacity==rear)
        {
            System.out.println("Queue is full");
            return;
        }
        else {
            queue[rear] = data;
            rear++;
        }
    }

    void queueDeque()
    {
        if(front==rear)
        {
            System.out.println("queue is empty");
            return;
        }
        else
        {
            for(int i=0;i<rear;i++)
            {
                queue[i]=queue[i+1];
            }
            rear--;
        }
    }

    void displayQueue()
    {
        if(front==rear){
            System.out.println("No Element in queue");
            return;
        }
        for(int i=front; i<rear; i++)
        {
            System.out.println("i");
        }
        return;
    }
}
