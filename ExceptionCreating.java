class MyException extends Exception
{
    MyException()
    {

    }
    MyException(String msg)
    {
        super(msg);
    }
}
public class ExceptionCreating
{
    public static void main(String[] args)
    {
    int y =9;
    int f=-10;
    try{
        if(f<0)
        {
            throw  new MyException("negative number");
        }
        else
        {
            int r=y/f;
            System.out.println(r);
        }
    }
    catch(Exception e)
    {
        System.out.println("enter the valid number"+e);
    }


}}
