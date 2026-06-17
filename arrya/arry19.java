import java.util.Scanner;//input 4 element
class Arry19
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[];//array declaration
		arr=new int[4];//arrya instaion
		int index;
		System.out.println("enter 4 element");
		for(index=0;index<arr.length;index++);
		{
			arr[index]=sc.nextInt();
		}
			System.out.println("elements are");
			for(index=0;index<arr.length;index++);
			{
				System.out.println(arr[index]+" ");
				
			}
	}
}