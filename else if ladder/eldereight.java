import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number ");
         int no=sc.nextInt();
         if(no%35==0)
         {
            System.out.println("div by 5 and 7");
         }
         else if(no%5==0)
         {
            System.out.println("div by only 5");
         }
         else if(no%7==0)
         {
            System.out.println("div by only 7");
         }
         else
         {
            System.out.println("not div by 5 and 7 ");
         }

     }
}


