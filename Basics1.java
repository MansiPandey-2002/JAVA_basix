//BASICS-->Rearrange positive and negative elements in an array in a sorted manner
import java.util.Scanner;

class Arrange
{
	void arrange(int[] a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}

class Main
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size");
		int n=input.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=input.nextInt();
		Arrange sort=new Arrange();
		sort.arrange(a);
		System.out.println("Sorted array is");
		for(int i=0;i<n;i++)
			System.out.println(a[i] + "  ");
		input.close();
	}
}
