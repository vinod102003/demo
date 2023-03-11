class demo12
{
    public void a() throws Exception
    {
        System.out.println("in a");
        int value=90;
        b();
//      try{
//          b();
//
//    }catch (Exception e)
//      {
//          System.out.println("Error:"+e);
//
      }


public void b() throws Exception
{
    int num1=2;
    int num2=0;
    int r=num1/num2;
    System.out.println(r);
//      try
//      {int result=num1/num2;
//    System.out.println(result);
//
//
//
//    }catch (Exception e )
//
//      {
//          System.out.println("error");
//      }

    }
        }

public class ExceptionDucking
{

    public static void main(String[] args)
    {
        demo12 obj = new demo12();

       try
       {
           obj.a();
        }
       catch (Exception e )
       {
           System.out.println("Error :"+e);
       }

    }
}
