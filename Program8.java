import java.util.Scanner;
class Program8{
  public static void reverse(int n,int rev){
     if(n>0){
       int rem=n%10;
        rev=rev*10+rem;
       n=n/10;
       reverse(n,rev);
    }
   else
    System.out.println(rev);
    
  }

  public static int plaindrome(int n,int rev){
     if(n>0){
       int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
       return plaindrome(n,rev);
        
    }
   else
    return rev;
   
  }
 
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the no");
  int n=sc.nextInt();
  int rev=plaindrome(n,0);

  if(rev==n)
    System.out.println("It is plaindrome Number");
  else
    System.out.println("No it is Not plaindrome Number");
 }


}