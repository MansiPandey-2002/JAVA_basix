//Implementation of Runnable Class

class My implements Runnable //run () method
{
	 public void run()
	 {
		 int i=1;
		 while(true)
		 {
			 System.out.println(i+"Hello");
			 i++;
		 }
	 }
}
class Main
{
	public static void main(String[] args)
	{
		My m=new My();
		Thread t=new Thread(m);
		t.start();
		int i=1;
		while(true)
		{
			System.out.println(i+"WElcome");
			i++;
		}
	}	
}

