import java.awt.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PASS
{
	public int passhold=7736;
	JFrame frame;
	public static void main(String args[])
	{
		PASS p=new PASS();
		p.setVisible(true);
	}
	public void setVisible(boolean t)
	{
		frame.setVisible(t);
	}

	public PASS()
	{
		frame = new JFrame("LOGIN");
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 300, 200);
		 //frame.setVisible(true);
		
		JTextField textField = new JTextField();
		textField.setBackground(Color.YELLOW);
		textField.setBounds(107, 55, 141, 22);
		frame.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(83, 11, 155, 22);
		frame.add(lblNewLabel);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBackground(Color.YELLOW);
		passwordField.setBounds(107, 102, 141, 20);
		frame.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(35, 59, 87, 14);
		frame.add(lblNewLabel_1);
		
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPassword.setBounds(35, 105, 87, 14);
		frame.add(lblPassword);
        
        JTextField textField2 = new JTextField();
		textField2.setBounds(201, 128, 73, 23);
		frame.add(textField2);
		textField2.setColumns(10);

		JButton btnNewButton = new JButton("ok");
		btnNewButton.setBounds(117, 128, 40,40);
		frame.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 String s1,s3;
				 char[] input = passwordField.getPassword();
				 String x=new String(input);
				
			 
				 System.out.println(passhold);
				try
				{
					
		
			s1=textField.getText();
					//s2=textField.getPASS();
					//s3="MATCH";

        // TODO code application logic here
        DataAccess da=new DataAccess();
        ResultSet rs=null;
        String q="select PASSWORD from HMHP where USER_NAME='"+s1+"'";
       // System.out.println(q);
         //System.out.println(s1);
         // System.out.println(input);
        rs=da.getData(q);
        System.out.println(rs);
		//String nm="M";

        while(rs.next())
        {
            //int id = rs.getInt("age");
            String n = rs.getString("PASSWORD");
            System.out.println(n);
            //String n1 = rs.getString("USER_NAME");
           // System.out.println(n);
               if(n.equals(x))
               {
               MHP p=new MHP();
		p.setVisible(true);
		//textField2.setText(passhold);
                
                }
                else
                		textField2.setText("error");
     
        }
				}				
				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "please try again");
				}
								
			}
		});
		


		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(192, 133, 46, 14);
		frame.add(lblNewLabel_2);

	}
}

