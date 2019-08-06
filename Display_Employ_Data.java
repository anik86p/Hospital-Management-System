import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DisplayEmpData extends JFrame implements ActionListener {

    JFrame frame1;
    JLabel l0, l1, l2;
    JComboBox c1;
    JButton b1;
    Connection con;
    ResultSet rs, rs1;
    Statement st, st1;
    PreparedStatement pst;
    String ids;
    static JTable table;
    String[] columnNames = {"First Name", "Last Name", "Password", "Phone"};
    String from;

    DisplayEmpData() {

        l0 = new JLabel("Select Customer to obtain Information");
        l0.setForeground(Color.red);
        l0.setFont(new Font("Serif", Font.BOLD, 20));
        l1 = new JLabel("Select name");
        b1 = new JButton("submit");

        l0.setBounds(100, 50, 350, 40);
        l1.setBounds(75, 110, 75, 20);
        b1.setBounds(150, 150, 150, 20);
        b1.addActionListener(this);

        setTitle("Fetching Student Info From DataBase");
        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(l0);
        add(l1);;
        add(b1);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "7736");
            st = con.createStatement();
            rs = st.executeQuery("select * from HMHP");
            Vector v = new Vector();
            while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
            }
            c1 = new JComboBox(v);
            c1.setBounds(150, 110, 150, 20);

            add(c1);
            st.close();
            rs.close();
        } catch (Exception e) {
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            showTableData();
        }

    }

    public void showTableData() {

        frame1 = new JFrame("Database Search Result");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
        JLabel label = new JLabel("New label");
 
       JLabel lblNewLabel_1 = new JLabel("DELETE:");
       lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(37, 108, 79, 31);
       frame1.add(lblNewLabel_1);


 


        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        from = (String) c1.getSelectedItem();

        JButton btnNewButton = new JButton("OK");
       btnNewButton.setBounds(126, 110, 69, 31);
       frame1.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
                 
                try
                {
             
                DataAccess da=new DataAccess();
                String q="delete from HMHP where FIRST_NAME='"+from+"'";
                int c=da.updateDB(q);
                }               
                
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "please try again");
                }
                                
            }
        });
        String FIRST_NAME = "";
        String LAST_NAME = "";
        int PASSWORD = 0;
        int PHONE = 0;

        try {
            pst = con.prepareStatement("select * from HMHP where FIRST_NAME='" + from + "'");
            ResultSet rs = pst.executeQuery();
            int i = 0;
            if (rs.next()) {
               FIRST_NAME = rs.getString("FIRST_NAME");
               LAST_NAME = rs.getString("LAST_NAME");
                PASSWORD = rs.getInt("PASSWORD");
               PHONE = rs.getInt("PHONE");
                model.addRow(new Object[]{FIRST_NAME, LAST_NAME,PASSWORD, PHONE});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(400, 300);
    }

    public static void main(String args[]) {
        new DisplayEmpData();
    }
}