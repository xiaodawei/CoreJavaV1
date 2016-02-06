/**
 * This is the string sample program in Core Java Chapter 3.
 * @version 0.01 2016-02-06
 * @author Dave Xiao
*/

public class StringTest
{
    public static void main(String[] args)
    {
        String javaTM = "Java\u2122";
        System.out.println(javaTM);

        String greeting = "Hello";
        String e = greeting.substring(0, 3);
        System.out.println(e);

        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);

        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);
    }
}
