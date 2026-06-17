import java.util.Scanner;
class Test
{
	public static void main(String arg[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a p ");
	    double p=sc.nextDouble();
	     System.out.println("enter interset");
	    double r=sc.nextDouble();
	    System.out.println("enter time");
	    int t=sc.nextInt();
	    double si=p*r*t/100;
	    System.out.println("simple interset="+si);
	}
}

