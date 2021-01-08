public class ExceptionHandling {
    /**
     * Exception handling
     */
    public static void main(String args[]) {

        try {                                    //try block
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e)                    //arithmetic exception in catch block
        {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e)                 //array out of bound exception in catch block
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        } finally                                                             //finally block
        {
            System.out.println("finally block is always executed");
        }

        // throw an exception
        //throw new ArithmeticException("Trying to divide by 0");

    }
}
