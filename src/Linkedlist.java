import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<String>();        //creating a string linked list
        //adding elements to the linked list
        a.add("Ravi");
        a.add("sheetal");
        a.add("Ravi");
        a.add("sheetal");
        a.add("Gaurav");
        a.add("Amit");
        a.add(2, "lav");

        System.out.println("LinkedList");
        Iterator<String> i = a.iterator();      //use of iterator() to retrieve elements one by one
        while (i.hasNext())                        //use of hasnext() to return th boolean value for token in its input
        {
            System.out.println(i.next());
        }

        a.remove("Gaurav");                 //remove the element from the linked list
        System.out.println("After removing :" + a);

        //add the element at first
        a.addFirst("Abhishek");

        //add the element at last
        a.addLast("Preety");

        System.out.println("New LinkedList");
        for (int j = 0; j < a.size(); j++) {            //print the elements of a list
            System.out.print(a.get(j) + " ");
        }
        System.out.println();
        for (String str : a)
            System.out.print(str + " ");

        System.out.println("\nElement at the index(2): " + a.get(2));           //print the element a 2nd index

        // create a new collection and add some elements
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);

        LinkedList n = new LinkedList();    //created a new linked list
        n.addAll(collection);               // append the collection in the LinkedList
        n.addAll(a);

        System.out.println("LinkedList: " + n);      // print the new list

        //change the elements at index 3
        n.set(3, "Nisha");
        System.out.println("Updated LinkedList: " + n);

        //returns the index of the first occurrence of the element
        System.out.println(n.indexOf("sheetal"));

        //returns the index of the last occurrence of the element
        System.out.println(n.lastIndexOf("sheetal"));

        //remove the first element of the list
        System.out.println(n.removeFirst());

        //remove the last element of the list
        System.out.println(n.removeLast());

        //remove the last element of the list
        System.out.println(n.size());

        //removes all the elements of the LinkedList
        n.clear();

        //Linkedlist as Queue
        Queue<String> languages = new LinkedList<>();

        // add elements
        languages.add("Python");
        languages.add("Java");
        languages.add("C");
        System.out.println("LinkedList: " + languages);

        // access the first element
        String str1 = languages.peek();
        System.out.println("Accessed Element: " + str1);

        // access and remove the first element
        String str2 = languages.poll();
        System.out.println("Removed Element: " + str2);
        System.out.println("LinkedList after poll(): " + languages);

        // add element at the end
        languages.offer("Swift");
        System.out.println("LinkedList after offer(): " + languages);


        //Linkedlist as Deque
        Deque<String> animals = new LinkedList<>();

        // add element at the beginning
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals);

        // add elements at the end
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);

        // remove the first element
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);

        // remove the last element
        animals.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals);

    }
}
