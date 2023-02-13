import java.util.Objects;

class beer{
    private int rate;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int bill(int n1, int n2, int n3){
        int total=n1+n2+n3;
   return total; }

  public void product(){
      System.out.println(rate+" "+brand);
  }



}

public class bbbbb {
    public static void main(String[] args) {
        beer check = new beer();
       int total= check.bill(60,70,89);
        System.out.println("the bill is="+total);
       ///// check.rate=78;
        ///check.brand="GT 2.0";
        check.setRate(78);
        check.setBrand("gt 2.0");
        check.getRate();
        check.getBrand();
        check.product();

    }
}
