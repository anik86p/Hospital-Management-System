import java.awt.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class admin
{
     JFrame frame;
	public static void main(String args[])
	{
		admin p=new admin();
		p.setVisible(true);
	}
	public void setVisible(boolean t)
	{
		frame.setVisible(t);
	}









	public admin()
	{
		  frame =new JFrame("ADMIN");
		frame = new JFrame();
	    //frame.getContentPane().setBackground(Color.WHITE);
		//frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 613, 366);
	
		 //frame.setVisible(true);
		
		JButton btnNewButton = new JButton("Customer Accounts");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(342, 84, 205, 29);
		frame.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				try
				{
	               DisplayEmpData p=new  DisplayEmpData();
                   p.setVisible(true);
                    System.out.println("ok");
              
				}				
				
				catch(Exception e)
				{
					 System.out.println("the hell");
				}
								
			}
		});
		
		JButton btnDoctorDetails = new JButton("Doctor Details");
		btnDoctorDetails.setBackground(Color.PINK);
		btnDoctorDetails.setBounds(342, 143, 205, 29);
		frame.add(btnDoctorDetails);
		
		JButton btnPendingAppoinment = new JButton("Pending Appoinment");
		btnPendingAppoinment.setBackground(Color.LIGHT_GRAY);
		btnPendingAppoinment.setBounds(342, 198, 205, 29);
		frame.add(btnPendingAppoinment);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRATION SITE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel.setBounds(326, 11, 227, 31);
		frame.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\website-administrator.jpg"));
		lblNewLabel_1.setBounds(10, 11, 244, 306);
		frame.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(493, 280, 46, 14);
		frame.add(lblNewLabel_2);
	}
}