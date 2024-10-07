class Program2{
  public static void printNumber(int n){
       if(n>0){
         System.out.println(n);
         n--;;
         printNumber(n);
       }
       else
         System.out.println("100 to 1 Numbers print successfully");
  }
  public static void main(String[] args){
     printNumber(100);
  }

}