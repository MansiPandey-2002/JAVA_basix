import java.lang.Math.*;
interface Inter
{
	double volume();
}

class Cone implements Inter
{
	private double h,r;
	void get(double h,double r)
	{
		this.h=h;
		this.r=r;
	}
	public double volume()  //either public or greater
	{
		return ((1.0/3.0)*Math.PI*r*r*h);
	}
}
class Hemisphere implements Inter
{
	private float r;
	void get(float r)
	{
		this.r=r;
	}
	public double volume()
	{
		return((2.0/3.0)*Math.PI*r*r*r);

	}
}
class Cylinder implements Inter
{
	private double h,r;
	void get(double h,double r)
	{
		this.r=r;
		this.h=h;
	}
	public double volume()
	{
		return (Math.PI*r*r*h);
	}
}

class Main
{
	public static void main(String[] args)
	{
		Cone c=new Cone();
		c.get(10,20);
		double res=c.volume();
		System.out.println("Volume is: "+res);
		Hemisphere h=new Hemisphere();
		h.get(10);
		res=h.volume();
		System.out.println("Volume is: "+res);
		Cylinder cy=new Cylinder();
		cy.get(10,20);
		res=cy.volume();
		System.out.println("Volume is: "+res);
	}
}
