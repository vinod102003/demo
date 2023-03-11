public class ExceptionThrow {
    public static void main(String[] args) {
        int n1 = 98;
        int n2 = -90;
        try {
            if (n2 < 0)
            {
//               Exception e =new ArithmeticException("negative number");
//                throw e;
                throw new ArithmeticException("negative number");
            }
            else
            {
                int r = n1 / n2;
                System.out.println(r);
            }
            }
        catch (Exception e)
        {
            System.out.println("enter the valid number:"+e);
        }
    }
}
