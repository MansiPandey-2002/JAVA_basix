//Creating a class named Person and Inheriting it to create class Student
import java.util.Scanner;
class Person
{
	private String name;
	private int age;
	Person() //no arguments
	{
		this.name="NULL";
		this.age=0;
	}
	Person(String name)//1 argument
	{
		this.name=name;
		this.age=0;
	}
	Person(String name,int age)//2 arguments
	{
		this.name=name;
		this.age=age;
	}
	void printdata()
	{
		System.out.println("Name is: "+name+"\nAge is: "+age);
	}
}

class Student extends Person
{
	private int roll;
	Student()
	{
		super();
		this.roll=0;
	}
	Student(String name)
	{
		super(name);
		this.roll=0;
	}
	Student(String name,int age,int roll)
	{
		super(name,age);
		this.roll=roll;
	}
	void printdata()
	{
		super.printdata();
		System.out.println("\nroll is: "+roll);
	}
}

public class Main 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name");
		String name=in.next();
		System.out.println("Enter age");
		int age=in.nextInt();
		System.out.println("SUper class with 0 arg");
		Person s1=new Person();
		s1.printdata();
		System.out.println("SUper class with 1 arg");
		Person s2=new Person(name);
		s2.printdata();
		System.out.println("SUper class with 2 arg");
		Person s3=new Person(name,age);
		s3.printdata();
		System.out.println("Derived class with 0 arg");
		Student o1=new Student();
		o1.printdata();
		System.out.println("Derived class with 1 arg");
		Student o2=new Student(name);
		o2.printdata();
		System.out.println("Derived class with 2 arg");
		Student o3=new Student(name,35,3);
		o3.printdata();
		in.close();
	}
}


