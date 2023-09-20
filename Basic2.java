//program to count words in a string

import java.util.Scanner;
class WordExample 
{
	private String strdata;
	private String[] s;
	private String occur;
	private String nonoccur;
	
	public WordExample(String str) {
		strdata = str;
		s = strdata.split("\\s+");
		occur = "";
		nonoccur = ""; //otherwise null also taken
	}
	
	public int countWord() {
		int count = 0;
		for (String i : s) 
		{
			char b = i.charAt(0);
			char e = i.charAt(i.length() - 1);
			if ((b=='a' || b=='e' || b=='i' || b=='o' || b=='u') && (e=='a' || e=='e' || e=='i' || e=='o' || e=='u')) 
			{
				count++;
				occur += i + " ";
			}
			else
			{
			    nonoccur+=i+" ";
			}
		}
		return count;
	}
	
	public String placeWord() 
	{
		String result = " ";
		result+=occur+nonoccur;
		return result;
	}
}

public class Main {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String str = in.nextLine();
		WordExample w = new WordExample(str);
		System.out.println("Number of words with vowels at beginning and end: " + w.countWord());
		System.out.println("After arrangement: " + w.placeWord());
		in.close();
	}
}
