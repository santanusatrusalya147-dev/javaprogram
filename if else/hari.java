import java.util.Scanner;
class Else7
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		String msg;
		msg=no>=0?"+Ve no":"-ve no";
		System.out.println(msg);
	}
}
