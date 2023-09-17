//Creating a BANK Class
import java.util.Scanner;

class Bank
{
	private String name;
	private String add;
	private int anum;
	private int bal;
	Bank(String name,String add,int bal)
	{
		this.name=name;
		this.add=add;
		this.bal=bal;
	}
	void create_acc(int acc)
	{
		anum=acc;
	}
	public void deposit(int amount)
	{
		bal+=amount;
	}
	public void withdraw(int amount)
	{
		bal-=amount;
	}
	public void change_add(String s)
	{
		add=s;
	}
	public int get_acc()
	{
		return anum;
	}
	public void printdata()
	{
		System.out.println("Deatails are:\nName:"+name+"\nAddress:"+add+"\nAccount in bank:"+anum+"\nBalance:"+bal);
	}
	
}

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of depositors:");
		int n=in.nextInt();
		in.nextLine();
		Bank[] b = new Bank[n];
		int acc=10011;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name,address,balance:");
			String name = in.nextLine();
			String add = in.nextLine();
			int bal=in.nextInt();
			in.nextLine();
			b[i]=new Bank(name,add,bal);
			b[i].create_acc(acc);
			acc++;
		}
		for(int i=0;i<n;i++)
			b[i].printdata();
		int found=0;
		while(true)
		{
			System.out.println("Enter account number");
			int a = in.nextInt();
			for(int i=0;i<n;i++)
			{
				int res=b[i].get_acc();
				if(res==a)
				{
					found=1;
					System.out.println("Enter 1 to display details\nEnter 2 to deposit\nEnter 3 to withdraw\nEnter 4 to change address");
					int choice=in.nextInt();
					in.nextLine();
					switch (choice)
					{
						case 1:
							b[i].printdata();	
							break;
						case 2:
							System.out.println("Enter amount to deposit");
							int amount=in.nextInt();
							b[i].deposit(amount);	
			
							break;
						case 3:
							System.out.println("Enter withdraw amount");
							int w = in.nextInt();
							b[i].withdraw(w);	

							break;
						case 4:
							System.out.println("Enter  new address");
							String s=in.nextLine();
								b[i].change_add(s);
							break;
					}
				}
		   }
		   if(found==0)
			  System.out.println("Account not found");
		   System.out.println("Press 1 to continue");
		   int c = in.nextInt();
		   if(c!=1)
				break;
		}
	}
}
