import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class TabelD implements ActionListener
{   JFrame f2;
    JTable j;
	JButton b1;
	String [][]data=new String[6][8];
	int i,p;
	String s1,s2,s3,s4,s5,s6;
	TabelD(String s,String l)
	{   
	    f2=new JFrame();
		b1=new JButton("Back");
		f2.add(b1);
		b1.setBounds(250,150,100,50);
		f2.setTitle(s+" Teacher Time Tabel");
		b1.addActionListener(this);
		if(l.equals("HINDI"))
		{
			for(i=0;i<6;i++)
				for(p=0;p<8;p++)
					data[i][p]="";
		        data[0][0]="Monday";
		        data[1][0]="Tuesday";
		        data[2][0]="Wednesday";
		        data[3][0]="Thursday";
		        data[4][0]="Friday";
		        data[5][0]="Saturday";
		    for(i=0;i<6;i++)
			   data[i][4]="  LUNCH";
		       s1="     V";s2="     VI";s3="     VII";s4="     VIII";s5="     IX";s6="     X";
		    for(i=0;i<6;i++)
			{
				data[i][1]=s1;
				data[i][2]=s2;
				data[i][3]=s3;
				data[i][5]=s4;
				data[i][6]=s5;
				data[i][7]=s6;
			}
		String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
		j=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(j);
		f2.add(sp);
		f2.setSize(700,400);
		f2.setVisible(true);}
		else if(l.equals("ENGLISH"))
		{
			for(i=0;i<6;i++)for(p=0;p<8;p++)data[i][p]="";
		        data[0][0]="Monday";
				data[1][0]="Tuesday";
				data[2][0]="Wednesday";
				data[3][0]="Thursday";
				data[4][0]="Friday";
				data[5][0]="Saturday";
		    for(i=0;i<6;i++)
				data[i][4]="  LUNCH";
			s2="     V";s3="     VI";s4="     VII";s5="     VIII";s6="     IX";s1="     X";
		    for(i=0;i<6;i++)
			{
				data[i][1]=s1;
				data[i][2]=s2;
				data[i][3]=s3;
				data[i][5]=s4;
				data[i][6]=s5;
				data[i][7]=s6;
			}
		String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
		j=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(j);
		f2.add(sp);
		f2.setSize(700,400);
		f2.setVisible(true);
		}
		else if(l.equals("SST"))
		{
			for(i=0;i<6;i++)
				for(p=0;p<8;p++)
					data[i][p]="";
		    data[0][0]="Monday";
		    data[1][0]="Tuesday";
		    data[2][0]="Wednesday";
		    data[3][0]="Thursday";
		    data[4][0]="Friday";
			data[5][0]="Saturday";
		    for(i=0;i<6;i++)
				data[i][4]="  LUNCH";
			s3="     V";s4="     VI";s5="     VII";s6="     VIII";s1="     IX";s2="     X";
		    for(i=0;i<6;i++)
			{
				data[i][1]=s1;
				data[i][2]=s2;
				data[i][3]=s3;
				data[i][5]=s4;
				data[i][6]=s5;
				data[i][7]=s6;
			}
		String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
		j=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(j);
		f2.add(sp);
		f2.setSize(700,400);
		f2.setVisible(true);
		}
		else if(l.equals("MATHS"))
		{
			for(i=0;i<6;i++)
				for(p=0;p<8;p++)
					data[i][p]="";
		    data[0][0]="Monday";
			data[1][0]="Tuesday";
			data[2][0]="Wednesday";
			data[3][0]="Thursday";
			data[4][0]="Friday";
			data[5][0]="Saturday";
		    for(i=0;i<6;i++)
			data[i][4]="  LUNCH";
		    s4="     V";s5="     VI";s6="     VII";s1="     VIII";s2="     IX";s3="     X";
		    for(i=0;i<6;i++)
			{
				data[i][1]=s1;
				data[i][2]=s2;
				data[i][3]=s3;
				data[i][5]=s4;
				data[i][6]=s5;
				data[i][7]=s6;
			}
		String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
		j=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(j);
		f2.add(sp);
		f2.setSize(700,400);
		f2.setVisible(true);
		}
		else if(l.equals("SCIENCE"))
		{
			for(i=0;i<6;i++)
				for(p=0;p<8;p++)
					data[i][p]="";
		    data[0][0]="Monday";
			data[1][0]="Tuesday";
			data[2][0]="Wednesday";
			data[3][0]="Thursday";
			data[4][0]="Friday";
			data[5][0]="Saturday";
		    for(i=0;i<6;i++)
				data[i][4]="  LUNCH";
			s5="     V";s6="     VI";s1="     VII";s2="     VIII";s3="     IX";s4="     X";
		    for(i=0;i<6;i++)
			{
				data[i][1]=s1;
				data[i][2]=s2;
				data[i][3]=s3;data[i][5]=s4;data[i][6]=s5;data[i][7]=s6;}
		String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
		j=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(j);
		f2.add(sp);
		f2.setSize(700,400);
		f2.setVisible(true);}
		else if(l.equals("SANSKRIT"))
		{
			for(i=0;i<6;i++)
				for(p=0;p<8;p++)
					data[i][p]="";
		data[0][0]="Monday";
		data[1][0]="Tuesday";
		data[2][0]="Wednesday";
		data[3][0]="Thursday";
		data[4][0]="Friday";
		data[5][0]="Saturday";
		for(i=0;i<6;i++)
			data[i][4]="  LUNCH";
		s6="     V";s1="     VI";s2="     VII";s3="     VIII";s4="     IX";s5="     X";
		for(i=0;i<6;i++)
		{
			data[i][1]=s1;
			data[i][2]=s2;
			data[i][3]=s3;
			data[i][5]=s4;
			data[i][6]=s5;
			data[i][7]=s6;
		}
		String []columnNames={"","7:30 to 8:15","8:20 to 9:05","9:10 to 9:55","10:00 t0 10:30","10:30 to 11:15","11:20 to 12:05","12:10 to 1:00"};
		j=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(j);
		f2.add(sp);
		f2.setSize(700,400);
		f2.setVisible(true);
		}
	}
     public void actionPerformed(ActionEvent e)
	{   
	    if(e.getSource()==b1)
		{
			f2.dispose();
			fr f1=new fr();
                        f1.setSize(700,400);
			f1.setVisible(true);
		}
	}
}
			