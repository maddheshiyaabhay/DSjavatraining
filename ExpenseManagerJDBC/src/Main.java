import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // pass the database the url,username,password in string
       String url = "jdbc:mysql://localhost:3306/expencedb";
       String user = "root";
       String password = "";

        try {
            Connection con= DriverManager.getConnection(url,user,password);
            System.out.println("Connected");
            //design the java UI for expence calculator
            JFrame frame= new JFrame("Abhay Expences");
            JLabel titlelabel= new JLabel("Expences");
            titlelabel.setBounds(200,20,100,50);
            titlelabel.setForeground(Color.BLUE);
            frame.add (titlelabel);

            JLabel expencestypelabel= new JLabel("enter Expences type");
            expencestypelabel.setBounds(30,50,250,50);
            expencestypelabel.setForeground(Color.RED);
            frame.add (expencestypelabel);

            JTextField expencestypefield =new JTextField();
            expencestypelabel.setBounds(170,90,100,30);
            frame.add (expencestypefield);

            JLabel expencesamountlabel= new JLabel("enter income amount");
            expencesamountlabel.setBounds(20,110,170,50);
            expencesamountlabel.setForeground(Color.RED);
            frame.add (expencesamountlabel);

            JTextField expencesAmountfield =new JTextField();
            expencesAmountfield.setBounds(170,120,100,30);
            frame.add (expencesAmountfield);

            JButton savebutton=new JButton("save");
            savebutton.setBounds(210,200,80,40);
            frame.add(savebutton);
















            frame.setSize(500,400);
            frame.setLayout(null);
            frame.setVisible(true);
            //to insert the data in to table.
            String insertQuery = "insert into expencetd(expencetype,expenceamount,incomeamount)values(?,?,?)";

            PreparedStatement ps= con.prepareStatement(insertQuery);
            ps.setString(1,"travel");
            ps.setInt(2,100);
            ps.setInt(3,500);
            ps.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}