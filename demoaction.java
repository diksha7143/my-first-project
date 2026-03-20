import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demoevent implements ActionListener
{
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	JLabel l3;
	public demoevent()
	{
		JFrame f = new JFrame();
		JLabel l1=new JLabel("Enter Number");
		JLabel l2=new JLabel("Enter Number");
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("Addition");
		b2=new JButton("Subtract");
		b3=new JButton("Multiply");
		b4=new JButton("Divide");
		l3=new JLabel();
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(l3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		FlowLayout ft = new FlowLayout(FlowLayout.LEFT,10,10);
		Font f1 = new Font("Arial",Font.BOLD,30);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		f.setSize(500,500);
		f.setLayout(ft);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int a,b,c;
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		if(e.getSource()==b1)
		{
			c=a+b;
			l3.setText("Addition is "+c);
		}
		if(e.getSource()==b2)
		{
			c=a-b;
			l3.setText("Subtraction is "+c);
		}
		if(e.getSource()==b3)
		{
			c=a*b;
			l3.setText("Multiply is "+c);
		}
		if(e.getSource()==b4)
		{
			c=a/b;
			l3.setText("Division is "+c);
		}

	}
}

class demoaction
{
	public static void main(String[] args) {
		demoevent d= new demoevent();
	}
}