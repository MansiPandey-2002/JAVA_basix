 class Mythread extends Thread
 {
	 synchronized public void run()
	 {
		 int i=1;
		 while(true)
		 {
			 System.out.println(i+" Hello ");
			 i++;
			 try
			 {
				 Thread.sleep(500);
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
			 } 
		 }
	 }
 }
 class Mythread2 extends Thread
 {
	 synchronized public void run()
	 {
		 int i=1;
		 while(true)
		 {
			 System.out.println(i+" World");
			 i++;
			 try
			 {
				 Thread.sleep(500);
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
		Mythread t=new Mythread();
		Mythread2 t2=new Mythread2();
		t.start();
		t2.start();
	}
}
