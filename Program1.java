class Program1{
  public static void printNumber(int n){
       if(n<=100){
         System.out.println(n);
         n++;
         printNumber(n);
       }
       else
         System.out.println("1 to 100 Numbers print successfully");
  }
  public static void main(String[] args){
     printNumber(1);
  }

}