        import java.sql.*;
        import java.io.*;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.util.*;
class LoginPage {
    JPanel panel;
    JFrame jf;
    JLabel label1, label2;
    JButton login, reset;
    JTextField textfield1;
    JPasswordField passwordfield;
    public LoginPage() {
        initComponents();
        handlingEvents();
    }
    public void initComponents() {
        jf=new JFrame();
        jf.setTitle("Login");
        jf.setLayout(null);
        jf.setSize(800,500);

        JScrollPane scrollBar=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jf.add(scrollBar);

        label1=new JLabel("User Name: ");
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        label1.setBounds(200,80,150,30);
        jf.add(label1);
        textfield1=new JTextField();
        textfield1.setFont(new Font("Arial", Font.PLAIN, 20));
        textfield1.setBounds(400,80,150,30);
        jf.add(textfield1);
        label2=new JLabel("Password: ");
        label2.setFont(new Font("Arial", Font.PLAIN, 20));
        label2.setBounds(200,120,150,30);
        jf.add(label2);
        passwordfield=new JPasswordField();
        passwordfield.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordfield.setBounds(400,120,150,30);
        jf.add(passwordfield);
        login=new JButton("Login");
        login.setFont(new Font("Arial", Font.PLAIN, 20));
        login.setBounds(250,180,150,30);
        jf.add(login);
        reset=new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 20));
        reset.setBounds(450,180,150,30);
        jf.add(reset);
        jf.show();
        jf.setVisible(true);
    }
    public void handlingEvents() {
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String un = textfield1.getText();
                String ui = passwordfield.getText();
                boolean valid = false;
                String username="";
                String uid="";
                try {
                    if (un.isEmpty() || ui.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "User Name  or password should not be empty.");

                    } else if (un.equalsIgnoreCase("admin") && ui.equalsIgnoreCase("admin")) {

                        MyFrame1 f = new MyFrame1();
                    } else {

                        if (getUser(un, ui)) {
                            JOptionPane.showMessageDialog(null, "Authenticated User");
                        } else {
                            JOptionPane.showMessageDialog(null, "Not Authenticated User");
                        }

                        // c.close();
                        //st.close();
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textfield1.setText("");
                passwordfield.setText("");
            }
            });
    }
    public static void main(String args[]) {
        LoginPage log = new LoginPage();
    }



private boolean getUser(String un, String pwd) {
        boolean valid = false;
        String username;
        String uid;

            final String url
                    = "jdbc:mysql://localhost:3306/msapp";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn = DriverManager.getConnection(
                        url, "root", "password");
            Statement st = conn.createStatement();
            st.execute("SELECT Name,Password FROM users WHERE Name='" + un + "' AND Password='" + pwd + "'");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                if (rs != null) {
                    username = rs.getString(1);
                    uid = rs.getString(2);
                    if(username.equalsIgnoreCase(un) && pwd.equalsIgnoreCase(uid))
                        valid = true;
                    else
                        valid = false;

                } else
                    valid = false;
            }
            conn.close();
        }
        catch(Exception e){
            
        }
        return valid;
}

}
                                                                     
                                                                     