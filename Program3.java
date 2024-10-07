import java.util.Scanner;
class Program3{
  public static void printTable(int n,int i){
      int table=0;
      if(i<=10){
       
         table=n*i;
        System.out.println(n+"*"+i+"="+table);
      
        printTable(n,i+1);
 
      }
      else
        System.out.println("Table of "+n+" print successfully");
   }

 public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the no to get table");
      int n=sc.nextInt();
      printTable(n,1);
 }
}