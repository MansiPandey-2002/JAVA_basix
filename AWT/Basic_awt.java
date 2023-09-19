import java.awt.*;
import java.awt.event.*;
class TestDemo extends Frame implements ActionListener
{
	TextField t1=new TextField();
	TextField t2=new TextField();
	TestDemo()
	{
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		Label l1=new Label("Enter String");
		Label l2=new Label("Result");
		Button b1=new Button("CountVowel");
		Button b2=new Button("Reset");
		Button b3=new Button("Exit");
		l1.setBounds(20, 40, 100, 30);
		l2.setBounds(20, 60, 40, 30);
		t1.setBounds(120, 40, 200, 30);
		t2.setBounds(120, 60, 200, 30);
		b1.setBounds(20, 100, 100, 30); 
		b2.setBounds(140, 100, 70, 30);
		b3.setBounds(240, 100, 50, 30);
		add(l1);add(l2);add(t1);add(t2);
		add(b1);add(b2);add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		addWindowListener(new WindowAdapter() 
		{
	         public void windowClosing(WindowEvent e) 
	         {
	             dispose();
	             System.exit(0);
	         }
	     });
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		String cd=e.getActionCommand();
		if(cd.equals("CountVowel"))
		{
			int count=0;
			String s=t1.getText();
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
					count++;
			}
			t2.setText(String.valueOf(count));
		}
		if(cd.equals("Reset"))
		{
			t1.setText("");
			t2.setText("");
		}	
		if(cd.equals("Exit"))
		{
			dispose();
			System.exit(0);
		}
	}
}
public class Main
{
	public static void main(String[] args)
	{
		TestDemo t=new TestDemo();
	}
}
