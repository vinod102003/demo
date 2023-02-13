public  class assingment {
    public static void main(String[] args) {
       String a = "vinod gouda";
       String b ="";
      String c[]= a.split(" ");
    //  for(int i=c.length-1;i>=0;i--){
      //    b=b+c[i];
for(String f :c){
    for(int i=f.length()-1;i>=0;i--){
        b=b+f.charAt(i);
    }

      }
        System.out.println(b);
    }



}







