import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MyFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;

    private JLabel email;
    private JTextField temail;

    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;

    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;


    // constructor, to initialize the components
    // with default values.
    public MyFrame() {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 30);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 30);
        tname.setLocation(200, 100);
        c.add(tname);

        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 30);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 30);
        tmno.setLocation(200, 150);
        c.add(tmno);


        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(100, 30);
        email.setLocation(100, 200);
        c.add(email);

        temail = new JTextField();
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(190, 30);
        temail.setLocation(200, 200);
        c.add(temail);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 30);
        gender.setLocation(100, 250);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 30);
        male.setLocation(200, 250);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 30);
        female.setLocation(275, 250);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);


        add = new JLabel("Language");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);
        String s1[] = {"English", "Hindi", "Telugu"};

        // create combo box
        JComboBox tadd = new JComboBox(s1);
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 30);
        tadd.setLocation(200, 300);
        c.add(tadd);

        JLabel label2 = new JLabel("Password: ");
        label2.setFont(new Font("Arial", Font.PLAIN, 20));
        label2.setSize(200, 20);
        label2.setLocation(100, 350);
        c.add(label2);

        JPasswordField passwordfield = new JPasswordField();
        passwordfield.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordfield.setSize(200, 30);
        passwordfield.setLocation(200, 350);
        c.add(passwordfield);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 30);
        term.setLocation(150, 400);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                try {
                    addUser();
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                res.setText("Registration Successfully..");
            } else {

                res.setText("Please accept the"
                        + " terms & conditions..");
            }
        } else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);

            resadd.setText(def);
        }
    }

    private void addUser()

            throws ClassNotFoundException {
        final String url
                = "jdbc:mysql://localhost:3306/msapp";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    url, "root", "password");

            PreparedStatement stmt=conn.prepareStatement(
                    "insert into users(name, email,mobile,gender,language,password) values(?,?,?,?,?,?)");
            stmt.setString(1,"Satya");
            stmt.setString(2,"Satya10illa@gmail.com");
            stmt.setString(3,"9948893897");
            stmt.setString(4,"female");
            stmt.setString(5,"language");
            stmt.setString(6,"Illa@12345");

            int result=stmt.executeUpdate();
            if (result > 0)
                System.out.println("successfully inserted");

            else
                System.out.println(
                        "unsucessful insertion ");

            // closing connection
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }


    }
}
// Driver Code
class SignIn {

    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}