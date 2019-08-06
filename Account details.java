import java.awt.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class gui1 
{
 public void  F1()
  {
   //JTextField textField;
  Frame frame =new Frame("REGISTRATION PAGE FOR NEW USER");

    frame.setBackground(Color.GRAY);
    frame.setVisible(true);
    frame.setBounds(100, 100, 833, 416);
   // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
JTextField textField = new JTextField();
    textField.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    textField.setBounds(147, 35, 192, 29);
    frame.add(textField);
    textField.setColumns(10);
    textField.setBackground(Color.LIGHT_GRAY);
     textField.setVisible(true);


JTextField textField_1 = new JTextField();
    textField_1.setColumns(10);
    textField_1.setBounds(147, 92, 192, 29);
    frame.add(textField_1);
     textField_1.setBackground(Color.LIGHT_GRAY);
     textField_1.setVisible(true);


   JTextField textField_2 = new JTextField();
    textField_2.setColumns(10);
    textField_2.setBounds(147, 145, 192, 29);
    frame.add(textField_2);
     textField_2.setBackground(Color.LIGHT_GRAY);
     textField_2.setVisible(true);

JTextField textField_3 = new JTextField();
    textField_3.setColumns(10);
    textField_3.setBounds(147, 203, 192, 29);
    frame.add(textField_3);
     textField_3.setBackground(Color.LIGHT_GRAY);
     textField_3.setVisible(true);
    
   JTextField textField_4 = new JTextField();
    textField_4.setColumns(10);
    textField_4.setBounds(147, 263, 192, 29);
    frame.add(textField_4);
     textField_4.setBackground(Color.LIGHT_GRAY);
     textField_4.setVisible(true);
    
    JTextField textField_5 = new JTextField();
    textField_5.setColumns(10);
    textField_5.setBounds(147, 317, 192, 29);
     textField_5.setBackground(Color.LIGHT_GRAY);
    frame.add(textField_5);
     textField_5.setVisible(true);


    JLabel lblFirstName = new JLabel("First name");
    lblFirstName.setBounds(33, 42, 88, 14);
    frame.add(lblFirstName);
   lblFirstName.setVisible(true);
    
    JLabel lblLastName = new JLabel("Last  name");
    lblLastName.setBounds(33, 99, 88, 14);
    frame.add(lblLastName);
    lblLastName.setVisible(true);
    
    JLabel lblGender = new JLabel("Gender");
    lblGender.setBounds(33, 152, 88, 14);
    frame.add(lblGender);
    lblGender.setVisible(true);
    
    JLabel lblDob = new JLabel("DOB");
    lblDob.setBounds(33, 210, 88, 14);
    frame.add(lblDob);
    lblDob.setVisible(true);
    
    JLabel lblAge = new JLabel("Age");
    lblAge.setBounds(33, 270, 88, 14);
    frame.add(lblAge);
    lblAge.setVisible(true);
    
    JLabel lblUserName = new JLabel("User name");
   lblUserName.setBounds(33, 324, 88, 14);
   frame.add(lblUserName);
   lblUserName.setVisible(true);

   JTextField textField_6 = new JTextField();
    textField_6.setBounds(568, 35, 166, 122);
    frame.add(textField_6);
    textField_6.setColumns(10);
     textField_6.setBackground(Color.LIGHT_GRAY);
    textField_6.setVisible(true);

    
    JTextField textField_7 = new JTextField();
    textField_7.setColumns(10);
    textField_7.setBounds(568, 170, 173, 29);
    frame.add(textField_7);
     textField_7.setBackground(Color.LIGHT_GRAY);
    textField_7.setVisible(true);

    
    JTextField textField_8 = new JTextField();
    textField_8.setColumns(10);
    textField_8.setBounds(568, 210, 173, 29);
    frame.add(textField_8);
     textField_8.setBackground(Color.LIGHT_GRAY);
    textField_8.setVisible(true);

    
    JTextField textField_9 = new JTextField();
    textField_9.setColumns(10);
    textField_9.setBounds(568, 250, 173, 29);
    frame.add(textField_9);
     textField_9.setBackground(Color.LIGHT_GRAY);
    textField_9.setVisible(true);

    
    JLabel lblAddress = new JLabel("Addr");
    lblAddress.setBounds(481, 89, 46, 14);
    frame.add(lblAddress);
    lblAddress.setVisible(true);
    
    JLabel lblMedicalInsuranceId = new JLabel("Medical insurance ID");
    lblMedicalInsuranceId.setBounds(422, 177, 140, 14);
    frame.add(lblMedicalInsuranceId);
  lblMedicalInsuranceId.setVisible(true);
    
    JLabel lblPhoneNumber = new JLabel("Phone Number");
    lblPhoneNumber.setBounds(460, 218, 140, 14);
    frame.add(lblPhoneNumber);
     lblPhoneNumber.setVisible(true);
    
    JLabel lblPassword_1 = new JLabel("Password");
    lblPassword_1.setBounds(482, 257, 140, 14);
    frame.add(lblPassword_1);
    lblPassword_1.setVisible(true);


JToggleButton tglbtnNewToggleButton = new JToggleButton("OK");
  tglbtnNewToggleButton.setToolTipText("OK");
    tglbtnNewToggleButton.setBounds(637, 317, 47, 29);
    frame.add(tglbtnNewToggleButton);
   tglbtnNewToggleButton.setVisible(true);



    JLabel lblRegister = new JLabel(" ");
   lblRegister.setBounds(573, 324, 140, 14);
    frame.add(lblRegister);
   lblRegister.setVisible(true);
    
    
    
  }
}


public class Accountdetails
{

   public static void main(String args[]) 
   {
         
     gui1 x=new gui1();
   
  // 
     x.F1();

   }
}