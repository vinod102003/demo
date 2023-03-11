public class   ExceptionFirst
{
    public static void main(String[] args) {
      int n1=6;
      int n2=0;
      int result=0;
      int values[]={4,7,2,9};
      try
      {
          result=n1/n2;
          System.out.println(values[11]);
        //  System.out.println("in try block");
      }catch (ArithmeticException e)
      {
          System.out.println("you can't divide a number by zero");
      }
      catch (ArrayIndexOutOfBoundsException e ){
          System.out.println("stay in your limits");
      }
      catch (Exception e)
      {
          System.out.println("something went wrong" );
      }


        System.out.println(result);
        System.out.println("fuck off bitch you got the answer");

    }
}
