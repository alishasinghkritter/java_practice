import java.util.*;

public class Intro_Set {
    public static void main(String[] args) {
        Set<String> hash_set = new HashSet<String>();       //set of string

        hash_set.add("welcome");    //add() to add one by one elements in the set
        hash_set.add("to");
        hash_set.add("kritter");
        hash_set.add("software");
        hash_set.add("technology");
        hash_set.add("software");


        System.out.println(hash_set);   //print the elements of set(no duplicate value)

        String check = "kritter";
        System.out.println("Conatians " + check + " " + hash_set.contains(check));        //check if the specified object is an element in hash_set

        hash_set.remove("software");        //remove the element from the hash_set
        System.out.println(hash_set.size());        //print the size of hash_set
        System.out.println("after removal " + hash_set);

        for (String value : hash_set)            //print the value of hash_set
        {
            System.out.print(value + ", ");
        }
        System.out.println();

        Set<Integer> a = new HashSet<Integer>();        //create a set of integer a
        a.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4            //addall the values to set a
                , 9, 8, 0}));

        Set<Integer> b = new HashSet<Integer>();            //create a set of integer b
        b.addAll(Arrays.asList(new Integer[]{1, 3, 7      //addall the values to set b
                , 9, 6, 5}));

        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);                                //use union to return all the elements from a & b set
        System.out.println("Union of set : " + union);

        Set<Integer> inter = new HashSet<Integer>(a);
        inter.retainAll(b);                             //use intersection to return all the common elements from a & b
        System.out.println("Intersection of set : " + inter);

        Set<Integer> diff = new HashSet<Integer>(a);
        diff.removeAll(b);                          //use to remove all the values from present in set a from set b
        System.out.println("Difference of set : " + diff);

        Set<Integer> numbers = new HashSet<>();         //set of integer
        Set<String> names = new LinkedHashSet<>();      //set of names
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);        //set of number
        System.out.println("\n" + listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println("\n" + uniqueNumbers);

        //add elements to name set
        names.add("Tom");
        names.add("Mary");

        //check the name is added to set or not
        if (names.add("Peter")) {
            System.out.println("Peter is added to the set");
        }

        //check if the tom is not added to set
        if (!names.add("Tom")) {
            System.out.println("Tom is already added to the set");
        }

        names.add(null);


        Iterator<String> iterator = names.iterator();       //use of iterator

        while (iterator.hasNext()) {
            String name = iterator.next();              //return an iterator object used to retrieve an object
            System.out.println(name);
        }

        names.forEach(System.out::println);     //use to give action for each element of the Iterable until all elements have been processed or the action throws an exception

        if (names.contains("Mary")) {           //check if the element mary is present in name set
            System.out.println("Found Mary");
        }

        names.clear();       //clear the set
        if (names.isEmpty())     //check if the set is empty
        {
            System.out.println("\nThe name set is empty");
        } else {
            System.out.println("\nThe name set is not empty");
        }
    }
}
