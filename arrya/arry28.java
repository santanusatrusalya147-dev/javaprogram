import java.util.Scanner;
class Arry28
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(Sydtem.in);
		int arr[][];
		System.out.println("enter 2d array r and col");
		int r=sc.nextInt();
		int c=sc.nextInt();
		arr=new int[r][c];
		System.out.println("enter "+r*c" elements ");
		int i,j;

		for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
		  arr[i][j]=sc.nextInt();
		}
	
	}
			System.out.println("elements are ");
			for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			  System.out.print(arr[i][j]+"\t");
		}
			System.out.println();
}



	}
}