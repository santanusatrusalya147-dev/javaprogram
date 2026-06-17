class Arry31
{
	public static void main(String arg[])
	{
		int [] marks={98,87,43,22,21};
		//System.out.println(marks.length);


		//displaying the arry (native way)
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);

		//displaying the arry (for loop)
		System.out.println("printing using for loop");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		//Quick Quiz: Displaying the arry in reverse order(for loop)
		System.out.println("printing using for loop in reverse order");
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}

	}
}
     //Quick Quiz:displaying the arry(for each-loop)
      for(int element : marks)
      {
      	System.out.println(element);

       }
   
