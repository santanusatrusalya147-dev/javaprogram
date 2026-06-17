import java.util.Scanner;
class Ladderone
{
	public static void main(String arg[])
{
	Scanner  sc=new Scanner(System.in);
	System.out.println("enter a number");
	int no=sc.nextInt();
	if(no==0)
		System.out.println("zero");
	else if(no>0)
		System.out.println("+ve");
	else
		System.out.println("-ve");
}
}