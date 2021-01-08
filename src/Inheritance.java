import java.util.*;

class Inheritance {
    public static void main(String args[]) {
        char ch;
        int choice;
        do {
            System.out.println("1. Single Inhertance");
            System.out.println("2. Multilevel Inhertance");
            System.out.println("3. Hierarchical Inhertance");
            System.out.println("4. Hybrid Inhertance");
            System.out.println("5. Method Overriding");
            System.out.println("6. Super Keyword");
            System.out.println("\nPlease enter your choice(1-6) : ");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();


            switch (choice) {
                case 1: {
                    System.out.println("Single Inhertance\n");
                    Son obj = new Son();
                    obj.printdetails();
                    break;
                }
                case 2: {
                    System.out.println("Multilevel Inhertance\n");
                    Son1 obj1 = new Son1();
                    obj1.printdetails();
                    break;
                }
                case 3: {
                    System.out.println("Hierarchical Inhertance\n");
                    Son2 obj2 = new Son2();
                    Daughter2 obj3 = new Daughter2();
                    break;
                }
                case 4: {
                    System.out.println("Hybrid Inhertance\n");
                    D d = new D(); //This calls constructors of parent class A and B
                    B b = new B(); //This calls constructors parent class A and B
                    C c = new C(); //This calls the constructors class A and C
                    break;
                }
                case 5: {
                    System.out.println("\nMethod Overriding\n");
                    Dog d = new Dog();
                    d.printMessage();
                    break;
                }
                case 6: {
                    System.out.println("\nSuper Keyword\n");
                    Dog1 d1 = new Dog1();
                    Dog1 d2 = new Dog1("pomeranian");
                    d1.printMessage();
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

//Single Inhertance
class Father        //parent class
{
    String familyName;
    String houseaddress;

    Father()                //parent class constructor
    {
        familyName = "Programmer";      //assign family name
        houseaddress = "Benagluru";      //assign house address
    }
}

class Son extends Father {         //child class extends father parent class
    String name;

    Son()                   //child class constructor
    {
        name = "shraman";
    }

    void printdetails() {
        System.out.println(" Hey my name is " + this.name + " " + this.familyName + " and I am from " + this.houseaddress);
        //print the values from parent and child class
    }

}

//Multilevel Inheritance
class GrandFather   //parent class
{
    GrandFather() {
        System.out.println("I am the grandfather");
    }
}

class Father1 extends GrandFather       //child class extends grandparent class
{
    String familyName1;
    String houseaddress1;

    Father1() {
        familyName1 = "Singh";
        houseaddress1 = "Delhi";
        System.out.println("I am the father! I inherit from Grandfather");
    }
}

class Son1 extends Father1 {        //child class extends father class
    String name;

    Son1() {
        System.out.println("I am the son and I inherit from my father.");
        name = "Ankeeta";
    }

    void printdetails() {
        System.out.println("Hey my name is " + name + " " + this.familyName1 + " and I am from " + this.houseaddress1);
    }
}

//Hierarchical Inheritance
class Father2       //parent class
{
    String familyName2;
    String houseaddress2;

    Father2() {
        familyName2 = "Programmer";
        houseaddress2 = "Kolkata";
    }
}

class Son2 extends Father2      //child class extends father parent class
{
    Son2() {
        System.out.println("I am the Son");
        System.out.println("My family name is " + this.familyName2 + " and I am from " + this.houseaddress2);
    }
}

class Daughter2 extends Father2     //child class extends father parent class
{
    Daughter2() {
        System.out.println("I am the Daughter");
        System.out.println("My family name is " + this.familyName2 + " and I am from " + this.houseaddress2);
    }
}

//Hybrid Inheritance
class A     //parent class for class B and C
{
    A()
    {
        System.out.println("I am in class A! I have two children B and C");
    }
}

class B extends A {      //child class extends B and parent class for D
    B() {
        System.out.println("I am in class B! I have 1 child D");
    }
}

class C extends A {     //child class extends A
    C() {
        System.out.println("I am in class C. I am the child class of A");
    }
}

class D extends B {     //child class extends B
    D() {
        System.out.println("I am in D class which is the extension of B class");
    }
}

//Method Overriding
class Animal {
    // overridden method
    public void display() {
        System.out.println("It's an animal");
    }
}

class Dog extends Animal {

    // overriding method
    public void display() {
        System.out.println("It's a dog");
    }

    public void printMessage() {
        display();      //calling the method
    }
}

//Super keyword
class Animal1 {
    String type = "animal";   //variable from parent class with same name as child class

    //default or no-arg constructor of class Animal
    Animal1() {
        System.out.println("Animal of parent class");
    }

    // parameterized constructor
    Animal1(String type1) {
        System.out.println("Type: " + type1);
    }

    // overridden method
    public void display() {
        System.out.println("It's an animal");
    }
}

class Dog1 extends Animal1 {
    String type = "mammal";       //variable from parent class with same name as child class

    Dog1() {
        // calling default constructor of the superclass
        super();
        System.out.println("Dog of child class");
    }

    Dog1(String breed) {
        // calling parameterized constructor of the superclass
        super("Domestic");
        System.out.println("Breed: " + breed);
    }

    // overriding method
    public void display() {
        System.out.println("It's a dog");
    }

    public void printMessage() {
        // this calls overriding method
        display();

        // this calls overridden method from parent class
        super.display();

        System.out.println("It's a " + type);       //child class variable
        System.out.println("It's an " + super.type);    //parent class variable
    }
}