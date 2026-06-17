class Arry18
{
	public static void main(String arg[])
	{
		int arr[]={3,7,4,9,6};
		int index;
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
 }