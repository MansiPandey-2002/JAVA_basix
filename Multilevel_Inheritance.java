//Multilevel Inheritance in Java
class Vehicle
{
	private String type;
	Vehicle(String type)
	{
		this.type=type;     //parameterised cons-->will have to use super() in car and sportscar() to avoid errors
	}
	public String getType()
	{
		return type;
	}
}
class Car extends Vehicle
{
	private String brand;
	Car(String type,String brand)
	{
		super(type);
		this.brand=brand;
	}
	void display()
	{
		String s=getType();
		System.out.println("Vehicle type is: "+s+"\nBrand is :"+brand);
	}
	
}
class Truck extends Vehicle
{
	private String brand;
	Truck(String type,String brand)
	{
		super(type); 
		this.brand=brand;
	}
	void display()
	{
		String s=getType();
		System.out.println("Vehicle type is: "+s+"\nBrand is :"+brand);
	}
	
}
class Main
{
	public static void main(String[] args)
	{
		Car s=new Car("Car","Honda");
		s.display();
		Truck t=new Truck("Truck","Mercedes");   //new objects can be created and added here
		t.display();
	}
}
