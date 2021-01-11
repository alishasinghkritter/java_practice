import java.util.Scanner;
import java.lang.*;

public class Enum {
    enum Number                     //enum Number with values
    {
        ONE(1), TWO(2), THREE(3);
        private int value; //private or not it will work

        private Number(int value) {
            this.value = value;
        }
    }

    enum Season {                   //enum season
        WINTER, SPRING, SUMMER, FAIL;
    }

    enum Day {                          //enum day
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    enum Size {                  //enum size
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    //enum with multiple values
    public enum person
    {
        buckey("nice","23"),
        alisha("cutie","24"),
        ankeeta("angry","20");

        private final String desc;
        private final String year;

        person(String description, String age)
        {
            desc = description;
            year = age;
        }

        public String getDesc()
        {
            return desc;
        }

        public String getyear()
        {
            return year;
        }

    }

    public static void main(String args[]) {

        for (Season s : Season.values())       //print the constant value of season enum
        {
            System.out.println(s);
        }
        System.out.println("Value of WINTER : " + Season.valueOf("WINTER"));             //print the constant enum value of winter
        System.out.println("Index of WINTER : " + Season.valueOf("WINTER").ordinal());   //print the position of an enum constant winter
        System.out.println("Index of SUMMER : " + Season.valueOf("SUMMER").ordinal());   //print the position of an enum constant summer
        Season s = Season.WINTER;
        System.out.println(s);

        Day d = Day.MONDAY;

        switch (d)               //use of enum with switch case
        {
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            case TUESDAY:
                System.out.println("wednesday");
                break;
            case WEDNESDAY:
                System.out.println("thursday");
                break;
            case FRIDAY:
                System.out.println("friday");
                break;
            case SATURDAY:
                System.out.println("saturday");
                break;
            default:
                System.out.println("other day");
                break;
        }

        for (Number n : Number.values())                //print the value of the constant in the Number enum
        {
            System.out.println(n + " " + n.value);
        }

        //use of compareTo()
        System.out.println("\ncompareTo : " + Size.SMALL.compareTo(Size.MEDIUM));       // returns ordinal(SMALL) - ordinal(MEDIUM)

        //use of toString()
        System.out.println("\ntoString: " + Size.MEDIUM.toString());         // returns "MEDIUM"

        Size[] enumArray = Size.values();
        int i;
        for (i = 0; i < enumArray.length; i++) {
            System.out.println(enumArray[i]);       //print ann array of enum type containing all the enum constants
        }

        System.out.println("\nAll car prices: ");
        for (Car c : Car.values())
            System.out.println(c + " costs " + c.getPrice() + " thousand dollars.");


        //multiple values of enum
        for(person p: person.values())
        {
            System.out.println(p+" "+p.getDesc()+" "+p.getyear());
        }
    }

    /*
    //using enum size with switch case
    Size pizzaSize;
    public void Enum(Size pizzaSize)
    {
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza()
    {
        switch(pizzaSize){
            case SMALL:
                System.out.println("I ordered a small size pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            case LARGE:
                System.out.println("I ordered a large size pizza.");
                break;
            case EXTRALARGE:
                System.out.println("I ordered a extralarge size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }*/

}

//enum constructor
enum Car {
    lamborghini(900), tata(2), audi(50), fiat(15), honda(12);
    private int price;

    Car(int p)      //default constructor of car class
    {
        price = p;
    }

    int getPrice()      //print the price of the car
    {
        return price;
    }
}





