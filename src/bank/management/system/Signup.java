package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName ,textFname, textEmail,textAdd,textcity,textState,textPin;
    //JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    JDateChooser dateChooser;

    Signup(){

        super("Application form");
        //bank image top right corner
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        //page1
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        add(label2);

        //personal details
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        //name
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 16));
        labelName.setBounds(100,160,100,25);
        add(labelName);


        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 14));
        textName.setBounds(300,160,400,25);
        add(textName);

        //fathers name
        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 16));
        labelfName.setBounds(100,190,200,25);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD, 14));
        textFname.setBounds(300,190,400,25);
        add(textFname);

        //DOB
        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 17));
        DOB.setBounds(100,230,180,25);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,230,400,25);
        add(dateChooser);

        //gender and buttons
        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 17));
        labelG.setBounds(100,260,200,25);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,260,60,25);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBounds(450,260,90,25);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        //email
        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 17));
        labelEmail.setBounds(100,290,200,25);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(300,290,400,25);
        add(textEmail);

        //maritial status
        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 17));
        labelMs.setBounds(100,320,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,320,100,25);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,320,100,25);
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,320,100,25);
        m3.setFont(new Font("Raleway", Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        //address

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 17));
        labelAdd.setBounds(100,350,200,25);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD, 14));
        textAdd.setBounds(300,350,400,25);
        add(textAdd);

        //city

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 17));
        labelCity.setBounds(100,380,200,25);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD, 14));
        textcity.setBounds(300,380,400,25);
        add(textcity);

        //pincode
        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 17));
        labelPin.setBounds(100,410,200,25);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD, 14));
        textPin.setBounds(300,410,400,25);
        add(textPin);

        //state
        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 17));
        labelstate.setBounds(100,440,200,25);
        add( labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD, 14));
        textState.setBounds(300,440,400,25);
        add(textState);

        //next button
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,480,80,30);
        next.addActionListener(this);
        add(next);



        //main frame
        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;

        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            // Debugging output to verify field values
            System.out.println("Form no: " + formno);
            System.out.println("Name: " + name);
            System.out.println("Father's Name: " + fname);
            System.out.println("DOB: " + dob);
            System.out.println("Gender: " + gender);
            System.out.println("Email: " + email);
            System.out.println("Marital Status: " + marital);
            System.out.println("Address: " + address);
            System.out.println("City: " + city);
            System.out.println("Pin Code: " + pincode);
            System.out.println("State: " + state);

            // Validate fields
            if (name.isEmpty() || fname.isEmpty() || dob.isEmpty() || gender == null || email.isEmpty() ||
                    marital == null || address.isEmpty() || city.isEmpty() || pincode.isEmpty() || state.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields!");
            } else {
                Connn c = new Connn();
                String q = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, pincode, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = c.connection.prepareStatement(q);
                preparedStatement.setString(1, formno);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, fname);
                preparedStatement.setString(4, dob);
                preparedStatement.setString(5, gender);
                preparedStatement.setString(6, email);
                preparedStatement.setString(7, marital);
                preparedStatement.setString(8, address);
                preparedStatement.setString(9, city);
                preparedStatement.setString(10, pincode);
                preparedStatement.setString(11, state);

                preparedStatement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Sign-up Successful!");
                new Signup2( first);
                setVisible(false);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }



    }

    public static void main(String[] args){
        new Signup();
    }

}
