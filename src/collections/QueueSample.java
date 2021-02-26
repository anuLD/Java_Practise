package collections;

import collections.Pojo.Employee;

import java.util.*;

public class QueueSample {

    public static void main(String[] args) {
        new QueueSample().checkPriorityQueue();
    }

    public void checkPriorityQueue()
    {
        PriorityQueue<String> stringQueue=new PriorityQueue<>();
        stringQueue.add("Chandra");
        stringQueue.add("Anu");
        stringQueue.add("Bas");
        stringQueue.add("Sathish");
        stringQueue.add("Yuvaraj");
        stringQueue.add("Deeshithan");
        System.out.println(stringQueue);
        stringQueue.remove("Yuvaraj");
        System.out.println(stringQueue);
        String element=stringQueue.element();
        System.out.println(element);
        stringQueue.poll();
        System.out.println(stringQueue);

        Employee employee1=new Employee(15, "anu", 25);
        Employee employee2=new Employee(1, "dp", 25);
        Employee employee3=new Employee(5, "kadir", 25);

        PriorityQueue<Employee> priorityQueue=new PriorityQueue(3, Comparator.comparing(Employee::getId).thenComparing(Employee::getAge));
        priorityQueue.add(employee1);
        priorityQueue.add(employee2);
        priorityQueue.add(employee3);
        System.out.println(priorityQueue);


        PriorityQueue<Integer> integerPriorityQueue=new PriorityQueue<>(10);
        integerPriorityQueue.addAll(Arrays.asList(10,8,9,5,6,3,4,7,8,1,2));
        System.out.println(integerPriorityQueue);
        integerPriorityQueue.poll();
        integerPriorityQueue.poll();
        integerPriorityQueue.poll();
        integerPriorityQueue.poll();
        integerPriorityQueue.element();

        System.out.println(integerPriorityQueue);
    }
    }


