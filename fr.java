import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class fr extends Frame implements ActionListener
{   Button b3,b4;
    Label b1,b2;
	TextField t1;
	JPasswordField t2;
	Connection con;
	Statement st;
	String s1,s2,s3,s4,s5,s6;
	ResultSet rs;
	int f=0;
	Color c1=new Color(242,170,166);
    Font font1,font2;Color c2=new Color(190,255,94);
	fr()
	{
		setBackground(c1);
	    b1=new Label("Username");
		b2=new Label("Password");
		t1=new TextField();
		t2=new JPasswordField();
		b3=new Button("SUBMIT");
		b4=new Button("Back");
	    setLayout(null);
		add(b1);add(b2);add(b3);add(t1);add(t2);add(b4);
		setTitle("Login Frame");
		font1=new Font("Segoe Print",Font.BOLD,25);
	    font2=new Font("Segoe Print",Font.BOLD,25);
	    b1.setBounds(100,80,180,40);b2.setBounds(100,200,180,40);
		t1.setBounds(300,85,300,30);t2.setBounds(300,205,300,30);
		b3.setBounds(200,300,125,40);b4.setBounds(350,300,125,40);
	    b3.addActionListener(this);
		b4.addActionListener(this);
		b1.setFont(font1);
		b2.setFont(font1);
	    b3.setFont(font2);
		b3.setBackground(c2);
		b4.setFont(font2);
		b4.setBackground(c2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b3)
		{ 
	    try{Class.forName("com.mysql.jdbc.Driver");
	    con=DriverManager.getConnection
	    ("jdbc:mysql://localhost:3306/jnp","root","root");
	    st=con.createStatement();
	    rs=st.executeQuery("select * from pskv");
		while(rs.next())
	  {
		s1= rs.getString("username");
		s2= rs.getString("password");
		s5=rs.getString("role");
		s6=rs.getString("section");
		s3=t1.getText();
		s4=t2.getText();
			if(s3.equals(s1)&&s4.equals(s2)&&s5.equals("student"))
			{ 
		    f=1;
			TabelB t2=new TabelB(s6);
	        dispose();
			}
			else if(s3.equals(s1)&&s4.equals(s2)&&s5.equals("teacher"))
			{  
		     f=1;
             TabelD t3=new TabelD(s1,s6);
			 dispose();
			}
		    
	  }		
	  if(f==0){JOptionPane.showMessageDialog(null,"Invalid username or password");}
	  rs.close();st.close();con.close();
	}  catch(Exception e){}	
	}
	else if(ae.getSource()==b4)
	{
		dispose();
		starte s1=new starte();
	}
    }
}