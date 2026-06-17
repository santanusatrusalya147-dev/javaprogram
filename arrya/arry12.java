import java.util.Scanner;
class Arry12
{
	public static void main(String arg[])
  {	
	Scanner sc=new Scanner(System.in);
		System.out.println("enter  how many element store in array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter"+size+" elements ");
		int index;
		for(index=0;index<arr.length;index++)   //arr.length repelace size
		{
		 arr[index]=sc.nextInt();
		}
  }

}