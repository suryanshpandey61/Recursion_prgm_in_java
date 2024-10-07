import java.util.Scanner;
class Program9{
    public static void getPower(int n,int i,int res)
    {
      if(i>0){
          res=res*n;
          getPower(n,i-1,res);
         
      }
      else
       System.out.println(res);
    }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no");
    int n=sc.nextInt();
    System.out.print("Enter the power");
    int i=sc.nextInt();
    getPower(n,i,1);
   
  }
}