import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

class MyFrame1
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel videoLabel;
    private JTextField videoText;
    private JLabel name;
    private JTextField tname;
    private JLabel email;
    private JButton temail;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    public MyFrame1()
    {
        setTitle("Upload Video");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

//        title = new JLabel("Upload Video");
//        title.setFont(new Font("Arial", Font.PLAIN, 30));
//        title.setSize(300, 30);
//        title.setLocation(300, 30);
//        c.add(title);
        videoLabel = new JLabel("Video Title");
        videoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        videoLabel.setSize(150, 30);
        videoLabel.setLocation(100, 70);
        c.add(videoLabel);

        videoText = new JTextField();
        videoText.setFont(new Font("Arial", Font.PLAIN, 15));
        videoText.setSize(150, 30);
        videoText.setLocation(280, 70);
        c.add(videoText);

        name = new JLabel("Category");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 30);
        name.setLocation(100, 100);
        c.add(name);

        String s2[] = { "Cartoon", "Kids", "Movies", "News"};

        // create checkbox
        JComboBox tname  = new JComboBox(s2);
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 30);
        tname.setLocation(200, 100);
        c.add(tname);

        mno = new JLabel("Language");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 30);
        mno.setLocation(100, 150);
        c.add(mno);

        String s1[] = { "English", "Hindi", "Telugu"};

        // create checkbox
        JComboBox tmno  = new JComboBox(s1);
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 30);
        tmno.setLocation(200, 150);
        c.add(tmno);

        email = new JLabel("Upload Video");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(150, 30);
        email.setLocation(100, 200);
        c.add(email);

        temail = new JButton("Choose File");
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(190, 30);
        temail.setLocation(250, 200);
        c.add(temail);

        temail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int option = fileChooser.showOpenDialog(c);

                if(option == JFileChooser.APPROVE_OPTION)
                {
                    File file = fileChooser.getSelectedFile();
                    //label.setText("Selected: " + file.getName());
                    System.out.println("Selected: " + file.getName());
                   saveVideoFile(file);
                }
                else{
                   // label.setText("Open command canceled");
                    System.out.println("Open command canceled");
                }
            }
        });


        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 250);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 250);
        reset.addActionListener(this);
        c.add(reset);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
    {
        System.out.println("came...."+e.getSource());
//
         if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);

        }
         else{
             try {
                 uploadVideo();
             } catch (ClassNotFoundException ex) {
                 throw new RuntimeException(ex);
             }
         }

    }
    private void saveVideoFile(File fileToBeSent ) {
        FileOutputStream dout = null;

        FileInputStream in = null;
        try {
            dout = dout = new FileOutputStream("/home/silla/Desktop/akshita.txt");
            in = new FileInputStream(fileToBeSent);
            byte[] buffer = new byte[1024];
            int bytesIn = -1;
            while ((bytesIn = in.read(buffer)) != -1) {
                dout.write(buffer, 0, bytesIn);
            }
            dout.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                in.close();
            } catch (Exception exp) {
            }
        }
    }
    private void uploadVideo()

            throws ClassNotFoundException {
        final String url
                = "jdbc:mysql://localhost:3306/msapp";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    url, "root", "password");

            PreparedStatement stmt=conn.prepareStatement(
                    "insert into videos(title, category,language, file_path) values(?,?,?,?)");
            stmt.setString(1,"Devara");
            stmt.setString(2,"Movie");
            stmt.setString(3,"Telugu");
            stmt.setString(4,"result.txt");

            // if result is greater than 0, it means values
            // has been added
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
class FileUploader {

    public static void main(String[] args) throws Exception
    {
        MyFrame1 f = new MyFrame1();
    }
}

