import java.util.ArrayList;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<String> languages = new ArrayList<>();        //create string arraylist

        //Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);

        
        // add() method with the index parameter
        languages.add(1, "JavaScript");
        System.out.println("Updated ArrayList: " + languages);

        // change the element of the array list
        /*languages.set(5, "Spring");                     //give an indexOutofBoundException
        System.out.println("Modified ArrayList: " + languages);
        */

        languages.set(3, "Spring");
        System.out.println("Modified ArrayList: " + languages);

        // create a new array of String type
        String[] arr = new String[languages.size()];


        //arraylist to array conversion

        // convert ArrayList into an array
        languages.toArray(arr);
        System.out.print("Array: ");

        // access elements of the array
        for (String item : arr) {
            System.out.print(item + ", ");
        }
        System.out.println("\n");

        // convert ArrayList into a String
        String str = languages.toString();
        System.out.println("String: " + str);


        //array list of integer elements
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements in the arraylist
        numbers.add(12);
        numbers.add(14);
        numbers.add(63);
        numbers.add(2);
        numbers.add(54);
        numbers.add(6);
        numbers.add(3);

        System.out.println("\nArrayList: " + numbers);

        // get the element from the arraylist
        int i = numbers.get(3);
        System.out.print("Element at index 3: " + i);

        //remove element from index 6
        int j = numbers.remove(6);
        System.out.println("\nUpdated ArrayList: " + numbers);
        System.out.println("Removed Element: " + j);
    }
}
