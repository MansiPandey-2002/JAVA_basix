//PRODUCER CONSUMER
import java.util.Scanner;
class Data
{
	int value=0;
	boolean flag=true;
	synchronized public void set(int v) throws InterruptedException
	{
		while(flag!=true)
			wait();
		flag=false;
		value=v;
		notify();
	}
	synchronized public int get() throws InterruptedException
	{
		int x=0;
		while(flag!=false)
			wait();
		flag=true;
		x=value;
		notify();
		return x;
	}
}
class Producer extends Thread
{
	Data d;
	public Producer(Data d)
	{
		this.d=d;
	}
	public void run() 
	{
		int i=1;
		while(true)
		{
			try
			{
				d.set(i);
				System.out.println("Producer "+i);
				i++;
				Thread.sleep(30);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
class Consumer extends Thread
{
	Data d;
	public Consumer(Data d)
	{
		this.d=d;
	}
	public void run()
	{
		while(true)
		{
			try {
			System.out.println("Consumer "+d.get());
			Thread.sleep(30);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
class Main
{
	public static void main(String[] args)
	{
		Data d=new Data();
		Producer P=new Producer(d);
		Consumer C=new Consumer(d);
		P.start();
		C.start();
	}
}
