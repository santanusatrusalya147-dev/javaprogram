import java.util.Scanner;
class Else10
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		if (no>=0)
			System.out.println("+Ve no");
		else
			System.out.println("-ve no");
	}
}
