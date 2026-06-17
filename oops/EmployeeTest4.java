class Empolyee
{
	String name;
	int age;
	int empid;
	double salary;
	int mobilenumber;
}
class EmpolyeeTest
{
	public static void main(String arg[])
	{
		Employee e = new Employee();
		e.name="santanu";
		e.age=25;
		e.empid=1567;
		e.salary=45000;
		e.mobilenumber=345678;
		System.out.println("emp name="+e.name);
		System.out.println("emp age="+e.age);
		System.out.println("emp id="+e.empid);
		System.out.println("emp salary="+e.salary);
		System.out.println("emp mobilenumber="+e.mobilenumber);
	}
}