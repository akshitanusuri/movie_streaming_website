import org.jdesktop.swingx.prompt.BuddyButton;

import javax.swing.*;
import java.awt.*;

public class Test
{
    public Test(){

    }
    public static void main(String args[]) {
        JFrame frame = new JFrame("JUNO - STUDENT APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1000,1000);

                JPanel mainPanel = new JPanel(new BorderLayout(10,10));
                mainPanel.setBorder(BorderFactory.createTitledBorder("Main Panel"));
                frame.add(mainPanel);

                // North Panel


        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10,10));
        northPanel.setBorder(BorderFactory.createTitledBorder("North Panel"));
        JLabel searchLabel = new JLabel("Search");
        JTextField searchField = new JTextField(15);
        JButton searchButton = new JButton("Go");
        northPanel.add(searchLabel);
        northPanel.add(searchField);
        northPanel.add(searchButton);
        mainPanel.add(northPanel, BorderLayout.NORTH);

        //South
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10,10));
        southPanel.setBorder(BorderFactory.createTitledBorder("South Panel"));
        JLabel southLabel = new JLabel("Powered by Mahindra University");
        southPanel.add(southLabel);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        //East
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new BoxLayout (eastPanel, BoxLayout.Y_AXIS));
        eastPanel.setBorder(BorderFactory.createTitledBorder("East Panel"));
        JLabel x1= new JLabel("Operating systems");
        JLabel x2= new JLabel("Oops in java");
        JLabel x3= new JLabel("Computer Networks");
        eastPanel.add(x1);
        eastPanel.add(x2);
        eastPanel.add(x3);

        mainPanel.add(eastPanel, BorderLayout.EAST);



        //West
        JPanel westPanel = new JPanel(new GridLayout(10,10,10,10));
        westPanel.setBorder(BorderFactory.createTitledBorder("West Panel"));
        JButton button1 = new JButton("Registration");
        JButton button2 = new JButton("Attendence");
        JButton button3 = new JButton("Time Table");
        westPanel.add(button1);
        westPanel.add(button2);

        westPanel.add(button3);

        mainPanel.add(westPanel, BorderLayout.WEST);

        //Centre
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10,10));
        centerPanel.setBorder(BorderFactory.createTitledBorder("center Panel"));
        JLabel x = new JLabel("welcome to student portal");
        x.setPreferredSize(new Dimension(500,300));
        x.setFont(new Font("Serif", Font.PLAIN, 25));
        centerPanel.add(x);
        mainPanel.add(centerPanel, BorderLayout.CENTER);




                frame.setVisible(true);


    }
}
