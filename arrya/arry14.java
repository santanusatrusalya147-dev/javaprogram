import java.util.Scanner;
class Aim
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[];   //array declartion
		System.out.println("enter how many element store ");
		int size=sc.nextInt();
		arr=new int[size]; //array instantion
		int index;
		System.out.println("enter "+size+" elements ");
		for(index=0;index<size;index++)
			{
			arr[index]=sc.nextInt();
			}
		System.out.println("elements are ");
		for(index=0;index<size;index++)
		{
		System.out.print(arr[index]+" ");
		}
	 }

}		




