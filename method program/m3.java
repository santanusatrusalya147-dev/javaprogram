import java.util.Scanner;
class M3
{
	static void check()
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter a Number");
	int no=sc.nextInt();
	if(no%2==0)
	{
		System.out.println("even Number");
	}
	else
	{
		System.out.println("odd Number");
	}
}
public static void main(String arg[])
{
	check();
}


}