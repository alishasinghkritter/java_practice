public class This_Keyword
{
    int rollno;
    String name;
    float fee;

    This_Keyword()                               //default constructor
    {
        System.out.println("my world");
    }

    This_Keyword(int rollno, String name, Float f)              //parametrized constructor
    {
        this();                                         //always call at the starting of the constructor
        this.rollno = rollno;
        this.name = name;
        fee = f;                                        //this.fee same
    }

    void m() {
        System.out.println("Hello");

    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
        this.m();                                           //m() is same
    }

    public static void main(String args[]) {
        This_Keyword s1 = new This_Keyword(111, "ankit", 5000f);
        This_Keyword s2 = new This_Keyword(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}
