import java.awt.*;
import java.awt.event.*;
class TestDemo extends Frame implements ActionListener
{
	TestDemo()
	{
		setSize(400,400);
	    setVisible(true); 
	    setLayout(null);
		Button b1=new Button("Green");
		Button b2=new Button("Red");
		Button b3=new Button("Blue");
		b1.setBounds(40, 80, 100, 30); 
		b2.setBounds(150, 80, 100, 30);
		b3.setBounds(270, 80, 100, 30);
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String c=e.getActionCommand();
		if(c.equals("Green"))
			setBackground(Color.green);
		if(c.equals("Red"))
			setBackground(Color.red);
		if(c.equals("Blue"))
			setBackground(Color.blue);
	}
}
public class Main
{
	public static void main(String[] args)
	{
		TestDemo t=new TestDemo();
		t.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}
