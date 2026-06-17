import java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number ");
       int no=sc.nextInt();
       if(no>=5)
        System.out.println("+ve no");
       else
        System.out.println("-ve no");
    }
}

