public class Singleton
{
    private static Singleton ins = null;            //singleton Object
    public String s;

    private Singleton()                             //make thr contructor private so that this class cannot be instantiated
    {
        s = "Hello world, my name is alisha";
    }

    public static Singleton getInstance()           //get the only object available
    {
        if (ins == null)
        {
            ins = new Singleton();
        }
        return ins;
    }
}

class Main {
    public static void main(String args[])
    {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);

        z.s = (z.s).toLowerCase();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);

    }
}
