import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class TabelB implements ActionListener
{   JFrame f2;
    JTable j;
	JButton b1;
	String s1,s2,s3,s4,s5,s6;
	TabelB(String s)
	{   f2=new JFrame();
	    b1=new JButton("Back");
		f2.add(b1);
		b1.setBounds(250,150,100,50);
		f2.setTitle("Class "+s+" Time Tabel");
		b1.addActionListener(this);
		if(s.equals("V")==true)
		{
           s1="HINDI";s2="ENGLISH";s3="SST";s4="MATHS";s5="SCIENCE";s6="SANSKRIT";
		   String [][]data={{"Monday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Tuesday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Wednesday",s1,s2,s3,"  LUNCH",s4,s5,s6},
		   {"Thursday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Friday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Saturday",s1,s2,s3,"  LUNCH",s4,s5,s6}};
		   String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
		   j=new JTable(data,columnNames);
		   JScrollPane sp=new JScrollPane(j);
		   f2.add(sp);
		   f2.setSize(700,400);
		   f2.setVisible(true);
		   f2.setBackground(Color.red);
		}
		else if(s.equals("VI")==true)
		{
			s2="HINDI";s3="ENGLISH";s4="SST";s5="MATHS";s6="SCIENCE";s1="SANSKRIT";
		    String [][]data={{"Monday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Tuesday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Wednesday",s1,s2,s3,"  LUNCH",s4,s5,s6},
		    {"Thursday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Friday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Saturday",s1,s2,s3,"  LUNCH",s4,s5,s6}};
		    String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
	        j=new JTable(data,columnNames);
			JScrollPane sp=new JScrollPane(j);
			f2.add(sp);f2.setSize(700,400);
			f2.setVisible(true);
			f2.setBackground(Color.red);
		}
		else if(s.equals("VII")==true)
		{
			s3="HINDI";s4="ENGLISH";s5="SST";s6="MATHS";s1="SCIENCE";s2="SANSKRIT";
		    String [][]data={{"Monday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Tuesday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Wednesday",s1,s2,s3,"  LUNCH",s4,s5,s6},
		    {"Thursday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Friday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Saturday",s1,s2,s3,"  LUNCH",s4,s5,s6}};
		    String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
	        j=new JTable(data,columnNames);
			JScrollPane sp=new JScrollPane(j);
			f2.add(sp);
			f2.setSize(700,400);
			f2.setVisible(true);
			f2.setBackground(Color.red);
		}
		else if(s.equals("VIII")==true)
		{
			s4="HINDI";s5="ENGLISH";s6="SST";s1="MATHS";s2="SCIENCE";s3="SANSKRIT";
		    String [][]data={{"Monday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Tuesday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Wednesday",s1,s2,s3,"  LUNCH",s4,s5,s6},
		    {"Thursday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Friday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Saturday",s1,s2,s3,"  LUNCH",s4,s5,s6}};
		    String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
	        j=new JTable(data,columnNames);
			JScrollPane sp=new JScrollPane(j);
			f2.add(sp);
			f2.setSize(700,400);
			f2.setVisible(true);
			f2.setBackground(Color.red);
		}
		else if(s.equals("IX")==true)
		{
			s5="HINDI";s6="ENGLISH";s1="SST";s2="MATHS";s3="SCIENCE";s4="SANSKRIT";
		    String [][]data={{"Monday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Tuesday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Wednesday",s1,s2,s3,"  LUNCH",s4,s5,s6},
		    {"Thursday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Friday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Saturday",s1,s2,s3,"  LUNCH",s4,s5,s6}};
		    String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
	        j=new JTable(data,columnNames);
			JScrollPane sp=new JScrollPane(j);
			f2.add(sp);
			f2.setSize(700,400);
			f2.setVisible(true);
			f2.setBackground(Color.red);
		}
		else if(s.equals("X")==true)
		{
			s6="HINDI";s1="ENGLISH";s2="SST";s3="MATHS";s4="SCIENCE";s5="SANSKRIT";
		    String [][]data={{"Monday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Tuesday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Wednesday",s1,s2,s3,"  LUNCH",s4,s5,s6},
		    {"Thursday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Friday",s1,s2,s3,"  LUNCH",s4,s5,s6},{"Saturday",s1,s2,s3,"  LUNCH",s4,s5,s6}};
		    String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
	        j=new JTable(data,columnNames);
			JScrollPane sp=new JScrollPane(j);
			f2.add(sp);
			f2.setSize(700,400);
			f2.setVisible(true);
			f2.setBackground(Color.red);
		}
    }
    public void actionPerformed(ActionEvent ae)
		{   if(ae.getSource()==b1)
			{
				f2.dispose();
                                fr f1=new fr();
                                f1.setSize(700,400);
                                f1.setVisible(true);
				
			}
		}
}