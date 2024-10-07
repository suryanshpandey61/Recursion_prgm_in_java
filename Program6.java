import java.util.Scanner;
class Program6{
  public static void getFactorial(int n,int fact){
     
     if(n>0){
       fact=fact*n;
       getFactorial(n-1,fact); 
       
     }
     else
       System.out.println(fact);  
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no to get Factorial:=");
    int n=sc.nextInt();
    getFactorial(n,1); 
  }
}