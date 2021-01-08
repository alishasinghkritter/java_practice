public class TestCase_Interface
{
    public static void main(String args[])
    {
        System.out.println("Language Interface");
        ProgrammingLanguage l = new ProgrammingLanguage();
        l.getName("Java");

        System.out.println("\nPolygon Interface");
        Rectangle r = new Rectangle();
        r.getArea(5, 6);

        System.out.println("\nMultiple Interface");
        Y obj = new Y();
        obj.print();
        obj.show();

    }
}

//interface
interface Language_Interface {
    String type = "programming language";           // by default public static final

    void getName(String name);                      //by default public and abstract method
}

// class implements interface
class ProgrammingLanguage implements Language_Interface {

    // implementation of abstract method
    public void getName(String name)
    {
        System.out.println(type + " : " + name);
    }

}

// create an interface
interface Polygon {
    void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon {

    // implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}


//multiple inheritance using interface
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Y implements Printable, Showable           //implements two interface
{
    public void print()                         //method from printable interface
    {
        System.out.println("Hello");
    }

    public void show()                           //method from show interface
    {
        System.out.println("Welcome");
    }
}
