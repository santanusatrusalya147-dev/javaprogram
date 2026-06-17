class Employee
{
   String name;
   int age;
   int empid;
   double salary;
   int mobilenumber;
}
	class EmployeeTest3
	{
		public static void main(String arg[])
		{
		Employee e=new Employee();
		e.name="ram";
		e.age=20;
		e.empid=345;
		e.salary=50000;
		e.mobilenumber=987356;
		System.out.println("emp name="+e.name);
		System.out.println("emp age="+e.age);
		System.out.println("emp id="+e.empid);
		System.out.println("emp salary="+e.salary);
		System.out.println("emp mobilenumber="+e.mobilenumber);

	}

	}