import java.util.Scanner;
class Else9
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a salary");
		double sal=sc.nextDouble();
		double da,hra,total;
		da=sal>=5000?sal*0.3:sal*0.1;
		hra=sal>=5000?sal*0.2:sal*0.05;
		total=sal+da+hra;
		System.out.println("basic sal="+sal);
		System.out.println("da="+da);
		System.out.println("hra="+hra);
		System.out.println("total="+total);
	}
}