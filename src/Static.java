import java.util.Scanner;

class Static {
    public static void main(String args[]) {
        char ch;
        int choice;
        do {
            System.out.println("--------------------------------------");
            System.out.println("1. Static and non-static method");
            System.out.println("2. Static and non-static variables");
            System.out.println("3. Use of static block");
            System.out.println("--------------------------------------");
            System.out.print("\nPlease enter your choice(1-3) : ");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();                  //take input as a integer value

            switch (choice) {
                case 1: {
                    System.out.println("Static and non-static method\n");
                    Student s1 = new Student(111, "Karan");
                    Student s2 = new Student(222, "Aryan");

                    //we can change the college of all objects by the single line of cod Student.college="BBDIT";
                    s1.display();
                    s2.display();

                    //Creating objects
                    Counter c1 = new Counter();
                    Counter c2 = new Counter();
                    break;
                }
                case 2: {
                    System.out.println("Static and non-static variables\n");
                    Student1.change();                          //calling change method

                    //creating objects
                    Student1 s1 = new Student1(111, "Karan");
                    Student1 s2 = new Student1(222, "Aryan");
                    Student1 s3 = new Student1(333, "Sona");

                    //calling display method
                    s1.display();
                    s2.display();
                    s3.display();
                    break;
                }
                case 3: {
                    System.out.println("Use of static block\n");
                    // calling the static method
                    Block.display();
                    break;
                }
                default: {
                    System.out.println("Invalid Choice");
                    break;
                }
            }

            System.out.print("\nDo you want to Continue(y/n) : ");
            ch = in.next().charAt(0);                           //take input as a character

        } while (ch == 'y' || ch == 'Y');

    }
}

//static and non-static methods
class Student {
    int rollno;                         //instance variable
    String name;
    static String college = "ITS";       //static variable

    //constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

class Counter {
    int count = 0;                                              //will get memory each time when the instance is created
    static int count1 = 0;                                    //will get memory only once and retain its value

    Counter() {
        count++;                                            //incrementing value
        System.out.println("non-static variable: " + count);
        count1++;                                           //incrementing the value of static variable
        System.out.println("static variable: " + count1);
    }
}

//use of a static and non-static method
class Student1 {
    int rollno;
    String name;
    static String college = "ITS";

    //static method to change the value of static variable
    static void change() {
        college = "BBDIT";
    }

    //constructor to initialize the variable
    Student1(int r, String n) {
        rollno = r;
        name = n;
        //college = "IGIT";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

//static block
class Block {
    // static variables
    static int a = 23;
    static int b;
    static int max;

    //final static variable can be initialized at the time of declaration
    final static int x = 10;

    // static blocks
    static {
        System.out.println("First Static block.");
        b = a * 4;
    }

    static {
        System.out.println("Second Static block.");
        max = 30;
    }

    // static method
    static void display() {

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("max = " + max);
        System.out.println("Final static variable: " + x);
    }


}
