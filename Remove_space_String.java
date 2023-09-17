import java.io.*;
class Vowel
{
    String remove(String s)
    {
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' &&s.charAt(i)!='o' &&s.charAt(i)!='u')
            {
                s2+=s.charAt(i);
            }
        }
        return s2;
    }
}
public class Main
{
	public static void main(String[] args) throws IOException //JVM handles if any exception is thrown
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in)); //new
		String s=input.readLine();
		System.out.println("The input string is "+s);
		Vowel v=new Vowel();
		s=v.remove(s);
	    System.out.println("The output string is "+s);
	    input.close();
	}
}
