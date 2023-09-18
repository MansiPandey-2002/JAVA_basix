class Data
{
	public void display(String str)
	{
		synchronized(this)
		{
			for(int i=0;i<str.length();i++)
				System.out.print(str.charAt(i));
		}

	}
}
class Printer1 extends Thread
{
	Data d;
	Printer1(Data d)
	{
		this.d=d;
	}
	public void run()
	{
		d.display("Printer 1 in execution\n");
	}
}
class Printer2 extends Thread
{
	Data d;
	Printer2(Data d)
	{
		this.d=d;
	}
	public void run()
	{
		d.display("Printer 2 in execution");
	}
}
public class Main 
{
	public static void main(String[] args )
	{
		Data d=new Data();
		Printer1 p1=new Printer1(d);
		Printer2 p2=new Printer2(d);
		p1.start();
		p2.start();
	}
}
