import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class X extends Frame implements ActionListener
{  JButton b5,b6;
   JLabel b1,b2,b3,b4;
   JTextField t1,t2;
   Connection con;
   ResultSet rs;
   Statement st;
   JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
   ButtonGroup g1,g2;
   Font font2,font1;
   Color c3=new Color(255,128,140);
   X()
   {
	   b1=new JLabel("Username");
	   b2=new JLabel("Password");
	   b3=new JLabel("Role");
	   b4=new JLabel("Class/Section");
	   b5=new JButton("SUBMIT");
       t1=new JTextField();
	   t2=new JTextField();
	   b6=new JButton("Back");
	   setBackground(c3);
	   font2=new Font("Arial",Font.BOLD,25);
	   font1=new Font("Arial",Font.BOLD,30);
	   r1=new JRadioButton();
	   r2=new JRadioButton();
	   g1=new ButtonGroup();
	   r1.setText("teacher");
	   r2.setText("student");
	   b1.setFont(font2);
	   b2.setFont(font2);
	   b3.setFont(font2);
	   b4.setFont(font2);
	   b5.setFont(font1);
	   b6.setFont(font1);
	   r3=new JRadioButton();
	   r4=new JRadioButton();
	   r5=new JRadioButton();
	   r6=new JRadioButton();
	   r7=new JRadioButton();
	   r8=new JRadioButton();
	   g2=new ButtonGroup();
	   r3.setText("V/HINDI");
	   r4.setText("VI/ENGLISH");
	   r5.setText("VII/MATHS");
	   r6.setText("VIII/SCIENCE");
	   r7.setText("IX/SST");
	   r8.setText("X/SANSKRIT");
	   add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(r3);add(r4);add(r5);add(r6);add(r7);add(r8);
	   add(t1);add(t2);add(r1);add(r2);g1.add(r1);g1.add(r2);
	   g2.add(r3);g2.add(r4);g2.add(r5);g2.add(r6);g2.add(r7);g2.add(r8);
	   setSize(700,400);
	   setVisible(true);
	   setLayout(null);
	   setTitle("Admission Form");
	   r1.setBackground(c3);
	   r2.setBackground(c3);
	   r3.setBackground(c3);
	   r4.setBackground(c3);
	   r5.setBackground(c3);
	   r6.setBackground(c3);
	   r7.setBackground(c3);
	   r8.setBackground(c3);
	   t1.setBounds(330,55,280,20);
	   t2.setBounds(330,125,280,20);
	   r1.setBounds(330,190,100,30);
	   r2.setBounds(430,190,100,30);
	   r3.setBounds(330,250,90,20);
	   r4.setBounds(440,250,90,20);
	   r5.setBounds(550,250,90,20);
	   r6.setBounds(330,290,90,20);
	   r7.setBounds(440,290,90,20);
	   r8.setBounds(550,290,90,20);
	   b1.setBounds(90,50,150,30);b2.setBounds(90,120,150,30);b3.setBounds(90,190,150,30);b4.setBounds(90,260,150,30);
	   b5.setBounds(130,330,150,40);b6.setBounds(310,330,150,40);
       b5.addActionListener(this);
	   b6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b5)
		{ 
     	try{
			Class.forName("com.mysql.jdbc.Driver");
	        con=DriverManager.getConnection
	        ("jdbc:mysql://localhost:3306/jnp","root","root");
	        st=con.createStatement();
	        rs=st.executeQuery("select * from pskv");
	        String username=t1.getText();String password=t2.getText();
	        String section="";
	        String role="";
	    if(r1.isSelected())
        { role="teacher";
        if(r3.isSelected())section="HINDI";
	    else if(r4.isSelected())section="ENGLISH";
	    else if(r5.isSelected())section="MATHS";
	    else if(r6.isSelected())section="SCIENCE";
	    else if(r7.isSelected())section="SST";
	    else if(r8.isSelected())section="SANSKRIT";
	 }
    else if(r2.isSelected())
    {role="student";
             if(r3.isSelected())section="V";
	   else if(r4.isSelected())section="VI";
	   else if(r5.isSelected())section="VII";
	   else if(r6.isSelected())section="VIII";
	   else if(r7.isSelected())section="IX";
	   else if(r8.isSelected())section="X";
	}
    
	{if(username.length()!=0&&password.length()!=0&&section.length()!=0&&role.length()!=0)
		{
			st.executeUpdate("INSERT INTO pskv (username,password,role,section)VALUES('"+username+"','"+password+"','"+role+"','"+section+"')");
		    dispose();rs.close();st.close();con.close();
		    fr f1=new fr();
            f1.setSize(700,400);
			f1.setVisible(true);
			JOptionPane.showMessageDialog(null,"Admission Successfully");
		}
	else 
	   {
		   JOptionPane.showMessageDialog(null,"Please fill all detail");
		   }}}catch(Exception e){System.out.println("EXC2 "+e);}}
    else if(ae.getSource()==b6)
	   {
		   dispose();
		 starte s1=new starte();	
       }
	}
}