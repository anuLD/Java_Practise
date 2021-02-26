package implementations;

public class SinglyLinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public SinglyLinkedList insert(SinglyLinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public void traversal_Print(SinglyLinkedList list) {
        Node currentNode = list.head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) {
        Node prevNode = null;
        Node currentNode = list.head;
        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            return list;
        }
        while (currentNode != null && currentNode.data != key) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            prevNode.next = currentNode.next;
        } else {
            System.out.println("key not found");
        }
        return list;
    }

    public SinglyLinkedList deleteByPosition(SinglyLinkedList list, int position) {
        Node currentNode = list.head;
        Node previousNode = null;
        if (position == 0 && currentNode != null) {
            list.head = currentNode.next;
            return list;
        }
        int counter = 0;
        while (currentNode != null) {
            if (counter == position) {
                previousNode.next = currentNode.next;
                break;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }
        if (currentNode == null) {
            System.out.println("No elements to be deleted");

        }
        return list;
    }

    public int getLength(Node node)
    {
        if(node==null)
            return 0;
        return 1+getLength(node.next);
    }

    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void findNthElement(int n)
    {
    }

    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.insert(list, 10);
        list.insert(list,20);
        list.insert(list,30);
        list.insert(list, 40);
        list.insert(list, 50);
        list.insert(list, 60);

        System.out.println("Linked List");
        list.traversal_Print(list);

        list.deleteByKey(list, 60);
        System.out.println("After deleting by key");
        list.traversal_Print(list);

        list.deleteByPosition(list,3);
        System.out.println("After Deletion By positon");
        list.traversal_Print(list);

        System.out.println("Length-->"+list.getLength(list.head));

    }

}
