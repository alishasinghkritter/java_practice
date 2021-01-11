public class Throw_Throws
{
    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible for voting");
        }
        else
        {
            System.out.println("Eligible for voting");
        }
    }

    int division(int a, int b) throws ArithmeticException
    {
        int s = a/b;
        return s;
    }

    public static void main(String args[]) {
        Throw_Throws obj = new Throw_Throws();
        obj.checkAge(13);
        System.out.println("End of throw");

        try {
            System.out.println(obj.division(15, 0));
        } catch (ArithmeticException e)
        {
            System.out.println("Shouldn't divide number by zero");
        }
    }
}
