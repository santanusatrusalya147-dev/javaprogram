class Student
{
	String name;
	int roll;
	double mark;
	Student(String n,int r,double m)
	{
		this.name=n;
		this.roll=r;
		mark=m;
	}
	void display()
	{
		System.out.println("my name="+this.name);
		System.out.println("my roll="+this.roll);
		System.out.println("mark="+mark);
	}
}
 class StudentTest15
 {
 	public static void main(String arg[])
 	{
 		Student s=new Student("papuni",4,70.77);
 		s.display();
 		Student s1=new Student("Gudu",2,99.87);
 		s1.display();
 		Student s2=new Student("badal",3,77.98);
 		s2.display();
 		Student s3=new Student("lucky",6,99.66);
 		s3.display();
 	}
 }