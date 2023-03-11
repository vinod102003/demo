import java.util.InputMismatchException;
import java.util.Scanner;



public class ExceptionFinally
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=0;
//try with resources:if our aim is to close only resource.
//        try(Scanner sc = new Scanner(System.in);)
//        {
//            num= sc.nextInt();
//            //  sc.close();
//        }
        try
      {
           num= sc.nextInt();
        //  sc.close();
      }
      catch (InputMismatchException e)
      {
          System.out.println("please enter number only");
        //  sc.close();
      }
      finally
      {
          sc.close();
      }

        System.out.println(num);




}
    }
