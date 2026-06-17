import java.util.Scanner;
class Else6
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter tho Number");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
			System.out.println("enter your choice\no1.add\no.2sub\no3.mult");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("sum ="+(no1+no2));
			}
			else if (ch==2)
			{
				System.out.println("sub="+(no1-no2));
			}
			else if(ch==3)
			{
				System.out.println("mult="+no1*no2);
			}
			else 
			{
				System.out.println("invalid choice");
			}
		}
	}
