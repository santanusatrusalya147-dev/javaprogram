class Person
{
	String name;
	int age;
    Person()
    {

    }
    Person(String name,int age)
    {
       this.name=name;
       this.age=age;
    }
    void setName(String name)
    {
       this.name=name;
    }
    void setAge(int age)
    {
      this.age=age;
    }
    String getName()
    {
       return name;
    }
    int getAge()
    {
       return age;
    }

}

class Student extends Person
{
	double mark;
	Student()
	{

	}
	Student(String name,int age,double mark)
	{
	    super(name,age);
	    this.mark=mark;
	}
	void setMark(double mark)
	{
	   this.mark=mark;
	}
	double getMark()
	{
	   return mark;
	}
}

class StudentPerson
{
	public static void main(String arg[])
	{
	   Student s=new Student("muna",18,90.50);
	   s.setName("muna das");
	   System.out.println("my name="+s.getName());
	   System.out.println("my xyz="+s.getAge());
	   System.out.println("my mark="+s.getMark());
	}
}