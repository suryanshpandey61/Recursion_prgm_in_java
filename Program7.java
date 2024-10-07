import java.util.Scanner;
class Program7{
  public static void getSumOfDigit(int n,int sum){
     if(n>0){
       int prev=n%10;
       sum=sum+prev;
       n=n/10;
       getSumOfDigit(n,sum);
  }
  else
   System.out.println("The sum of digits is :"+sum);
}
  
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number:=");
   int n=sc.nextInt();
   getSumOfDigit(n,0);
}

}