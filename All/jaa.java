import java.util.Scanner;
class Test
{
	public static void main(String arg[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter recatngle length and breadth");
	   double L=sc.nextDouble();
	   double B=sc.nextDouble();
	   double ar=L*B;
	   double pr=2*(L+B);
	   System.out.println("length="+L);
	   System.out.println("breadth="+B);
	   System.out.println("area="+ar);
	   System.out.println("perimeter="+pr);
	}
}
