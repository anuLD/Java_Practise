package implementations;

public class StackArrayImpl {
    public static final int MAX=1000;
    int top;
    int a[]=new int[MAX];

    StackArrayImpl()
    {
        top=-1;
    }

    boolean isEmpty()
    {
        return top<0;
    }

    public boolean push(int element) {
        if (top >= MAX - 1) {
            System.out.println("StackOverFlow");
            return false;
        } else {
            a[++top] = element;
            return true;
        }

    }
     public int pop()
        {
            if(top<0)
            {
                System.out.println("StackEmpty");
                return 0;
            }
            else
            {
                return a[top--];
            }
        }
        public int peek()
        {
            if(top<0)
            {
                System.out.println("stack underflow");
            return 0;
            }
            return a[top];
        }

    public static void main(String[] args) {
        StackArrayImpl stack=new StackArrayImpl();
        stack.push(10);
        stack.push(20);
        stack.peek();
        stack.pop();
    }


}
