import java.util.Scanner;
class m12
{
	static boolean check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Number");
		int n=sc.nextInt();
		if(n%2==0)
		return true;
		return false;

	}
	public static void main(String arg[])
	{
		if(check())
		{
			System.out.println("even Number");
		}
		else 
		{
			System.out.println("odd Number");
		}
	}
}
