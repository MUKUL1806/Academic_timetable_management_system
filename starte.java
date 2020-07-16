import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class starte extends Frame implements ActionListener
{  JButton b1,b2,b3;
   Color c1=new Color(190,255,94);
   Font font1;
	starte()
	{ 
	 setSize(700,400);
	 setVisible(true);
	 setTitle("Welcome Frame");
	 setBackground(c1);
	 font1=new Font("Segoe Print",Font.BOLD,15);
	 setLayout(null);
	 b1=new JButton("LOGIN");add(b1);b1.addActionListener(this);b1.setBounds(230,80,190,50);
	 b3=new JButton("Admission");add(b3);b3.addActionListener(this);b3.setBounds(230,180,190,50);
	 b2=new JButton("EXIT");add(b2);b2.addActionListener(this);b2.setBounds(230,280,190,50);b1.setFont(font1);b2.setFont(font1);b3.setFont(font1);
    }
	public void actionPerformed(ActionEvent ae)
    {  if(ae.getSource()==b1)
	   {
		dispose();
		fr f1=new fr();
        f1.setSize(700,400);
		f1.setVisible(true);
	   }
	   else if(ae.getSource()==b2)
	   {
		dispose();
	   }
       else if(ae.getSource()==b3)
	   {
		X x=new X();
       dispose();
	   }
    }
}