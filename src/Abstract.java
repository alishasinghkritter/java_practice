import java.util.*;

class Abstract {
    public static void main(String args[]) {
        char ch;
        int choice;
        do {
            System.out.println("--------------------------------------");
            System.out.println("1. Implementing abstract class and abstract method");
            System.out.println("2. Access constructor of abstract class");
            System.out.println("3. Final Keyword");
            System.out.println("--------------------------------------");
            System.out.print("\nPlease enter your choice(1-3) : ");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();


            switch (choice) {
                case 1: {
                    System.out.println("IImplementing abstract class and abstract method\n");
                    Cats c = new Cats();
                    c.makeSound();           // access abstract method of abstract class
                    c.eat();                // access method of abstract class

                    Dogs d = new Dogs();
                    d.makeSound();          // access abstract method of abstract class
                    d.eat();                // access method of abstract class
                    break;
                }
                case 2: {
                    System.out.println("Access constructor of abstract class\n");
                    Tomcat server = new Tomcat("Apache Tomcat");            //creating the object of tomcat class
                    server.start();
                    break;
                }
                case 3: {
                    System.out.println("Final Keyword\n");
                    Honda h = new Honda();
                    h.run();
                    break;
                }
                default: {
                    System.out.println("Invalid Choice");
                    break;
                }
            }

            System.out.print("\nDo you want to Continue(y/n) : ");
            ch = in.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

    }
}

//abstract method and class
abstract class Animals {
    abstract void makeSound();          //abstract method

    // method of abstract class
    public void eat() {
        System.out.println("It can eat.");
    }
}

class Dogs extends Animals {
    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Dog");
        System.out.println("Bark bark");
    }
}

class Cats extends Animals {
    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Cat");
        System.out.println("Mew mew");
    }
}

//abstract constructor
abstract class Server {
    String name;

    public Server(String name)          //parametrized constructor
    {
        this.name = name;
    }

    public abstract boolean start();
}

class Tomcat extends Server {
    public Tomcat(String name) {
        super(name);                //calling the constructor of abstract class and passing the server name
    }

    public boolean start()          //use of abstract method
    {
        System.out.println(this.name + " started successfully");
        return true;
    }
}

//Final keyword

class Bike {
    final int speedlimit = 90;        //final variable

    /*void speed() {
        speedlimit = 400;           //compile time error
    }*/
    final void run()            //final method
    {
        System.out.println("Bike is running on speed " + speedlimit);
    }
}

class Honda extends Bike {
    /*void run()                    //compile time error
    {
        System.out.println("running safely with 100kmph");
    }*/
}

final class Bike1 {
    void run() {
        System.out.println("running");
    }
}
/*class Honda1 extends Bike1{
    void run()                      //compile time error
    {
        System.out.println("running safely with 100kmph");
    }
}*/