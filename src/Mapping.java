import java.util.*;

public class Mapping {
    public static void main(String args[]) {
        // Creating a map using the HashMap
        Map<String, Integer> num = new HashMap<>();
        num.put("One", 1);                   //Adding elements to map
        num.put("Two", 2);
        num.put("Three", 3);
        num.put("Four", 4);
        num.put("Five", 5);

        // Access keys of the map
        System.out.println("Keys: " + num.keySet());

        // Access values of the map
        System.out.println("Values: " + num.values());

        // Access entries of the map
        System.out.println("Entries: " + num.entrySet());

        // Remove Elements from the map
        int value = num.remove("Two");
        System.out.println("Removed Value: " + value);

        //Returns a Set view of the mappings contained in this map
        num.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);

        Map names = new HashMap();

        //Adding elements to map
        names.put(1, "Amit");
        names.put(5, "Rahul");
        names.put(2, "Jai");
        names.put(6, "Amit");

        //Traversing Map
        Set set = names.entrySet();//Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //Returns a Set view of the mappings contained in this map
        names.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);


    }
}
