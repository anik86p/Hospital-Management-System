import java.awt.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HOME
{
	JFrame frame;
	public static void main(String args[])
	{
		HOME p=new HOME();
		p.setVisible(true);
	}
	public void setVisible(boolean t)
	{
		frame.setVisible(t);
	}
public HOME()
 {
          frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 102, 255));
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 515, 265);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		 //frame.setVisible(true);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\0088280d1373890873628.1b245e0c.m_hjmhjm.jpg"));
		lblNewLabel_1.setBounds(0, 0, 231, 225);
		frame.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("HOSPITAL");
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel.setBounds(269, 5, 169, 41);
		frame.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("MANAGEMENT");
		lblNewLabel_2.setForeground(new Color(72, 61, 139));
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_2.setBounds(269, 41, 220, 27);
		frame.add(lblNewLabel_2);
		
		JLabel lblSystem = new JLabel("SYSTEM");
		lblSystem.setForeground(new Color(72, 61, 139));
		lblSystem.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblSystem.setBounds(269, 70, 220, 27);
		frame.add(lblSystem);
		
		JLabel lblNewLabel_3 = new JLabel("Please Select");
		lblNewLabel_3.setForeground(new Color(245, 255, 250));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_3.setBounds(331, 103, 103, 14);
		frame.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Customer login");
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setBounds(308, 126, 130, 23);
		frame.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PASS p=new PASS();
				p.setVisible(true);
			}
		});
		
		JButton btnEmploy = new JButton("Employee login ");
		btnEmploy.setBackground(new Color(135, 206, 250));
		btnEmploy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PASS2 p1=new PASS2();
				p1.setVisible(true);
			}
		});
		btnEmploy.setBounds(308, 160, 130, 23);
		frame.add(btnEmploy);
		
		JButton btnNewUser = new JButton("New user");
		btnNewUser.setBackground(new Color(135, 206, 250));
		btnNewUser.setBounds(308, 194, 130, 23);
		frame.add(btnNewUser);
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NEWUSER p=new NEWUSER();
				p.setVisible(true);
			}
		});
		


 }
}

