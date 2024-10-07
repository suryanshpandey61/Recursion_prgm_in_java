class Program4{
 public static void printSum(int n,int sum){
   
   if(n<=100){
      sum=sum+n;
      n++;
      printSum(n,sum);
   }
   else
     System.out.println("the sum of 1 to 100 is :"+sum);
 }
  
 public static void main(String[] args){
    printSum(1,0);
 }

}