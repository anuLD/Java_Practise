package collections;


import java.util.*;

public class ListSample {
    public static void main(String[] args) {
        ListSample listSample= new ListSample();
      /*  List[] listArray=listSample.createList();
        listSample.addList(listArray[0], listArray[1]);
        listSample.removeList(listArray[0], listArray[1]);*/
        listSample.iterateList();
    }

    public List[] createList() {
        // List list=new ArrayList<>(-1);  // java.lang.IllegalArgumentException: Illegal Capacity: -1
        List<Integer> list = new ArrayList(10);
        List subList = new ArrayList();
        return new List[]{list, subList};
    }

       public void addList(List list, List subList)
        {
            /** ADD */
            list.add(1);
            subList.add(3);
            subList.add(5);
            list.add(1, 2);
            list.addAll(subList);
            list.addAll(2, subList);
        }

        public void fetchList(List<Integer> list, List subList) {
            int element_0 = list.get(0);
            int size = list.size();
            Boolean isEmpty = list.isEmpty();
            Boolean isContains = list.contains(2);
            Boolean isContainsAll = list.containsAll(subList);
            Object[] array = list.toArray();
            Object[] objectArray=list.toArray(new Object[]{6});
            int hashCode = list.hashCode();
            Boolean isEqual = list.equals(subList);
            int index_2 = list.indexOf(2);
            int last_index_2 = list.lastIndexOf(2);
            List subListWithIndex = list.subList(0, 5);  //include of 0 index, exclude 5 th index
        }
        public void removeList(List list, List subList) {
            list.remove((Integer) 5);
            list.remove(1);
            list.removeAll(subList);
            list.clear();
        }


        public void iterateList()
        {
            List<Integer> integerList=Arrays.asList(new Integer[]{10,20,30,40,50,60});
            int sum=0;
            for(int i=0;i<integerList.size();i++)
            {
                sum+=integerList.get(i);
                /*if(i==2)
                    integerList.remove(integerList.get(i));  //unsupported operation
         */   }
            System.out.println("Tradition for sum-->"+sum);
            sum=0;
            for(Integer intValue:integerList)
            {
                sum+=intValue;
               /* if(intValue==30)
                    integerList.remove((Integer)intValue);  //unsupported operation
                        integerList.add(70); //unsupported operation
*/
            }
            System.out.println(" for each sum-->"+sum);

            sum=0;
            System.out.println("Before removal of element-->"+integerList);

            Iterator iterator=integerList.iterator();
            while(iterator.hasNext())
            {
                Integer currentValue=(Integer)iterator.next();
                sum+=currentValue;
                if(currentValue<(Integer)30)
                {
                    integerList.remove(currentValue);   //unsupportedOperation //https://www.geeksforgeeks.org/remove-element-arraylist-java/
                }
            }
            System.out.println("Iterator sum-->"+sum);
            System.out.println("After removal of element-->"+integerList);

            sum=0;
            Iterator listIterator=integerList.listIterator();
            while(listIterator.hasNext())
            {
                sum+=(Integer)listIterator.next();
            }
            System.out.println("listIterator for sum-->"+sum);

        }
    }





