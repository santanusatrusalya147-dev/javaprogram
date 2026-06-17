class Student
{
	String name;
	int roll;
	double mark;
	Student (String n,int r,double m)
	{
		this.name=n;
		this.roll=r;
		mark=m;
	}
	void display()
	{
		System.out.println("my name="+this.name);
		System.out.println("my roll="+this.roll);
		System.out.println("my mark="+ mark);
	}
}
      class StudentTest13
      {
      	public static void main(String arg[])
      	{
      		Student s=new Student("santanu",1,88.70);
      		s.display();
      		Student s1=new Student("ram",2,99.50);
      		s1.display();
      		Student s2=new Student("babul",3,92.50);
      		s2.display();
      	}
      }