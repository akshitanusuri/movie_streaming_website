import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MainFrame extends JFrame{

    private JPanel contentPane;
     JFrame frmPlayerJava;
    private JFXPanel videoPanel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame window = new MainFrame();
                    window.frmPlayerJava.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
    }

    public MainFrame() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmPlayerJava = new JFrame();
      //  frmPlayerJava.setTitle("Player Java");
        frmPlayerJava.setBounds(100, 100, 1500, 2000);
        frmPlayerJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPlayerJava.getContentPane().setLayout(null);
        videoPanel = new JFXPanel();
        videoPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        videoPanel.setBounds(155, 60, 1500, 500);
        frmPlayerJava.getContentPane().add(videoPanel);

//        JLabel Title = new JLabel("Player Java");
//        Title.setHorizontalAlignment(SwingConstants.CENTER);
//        Title.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        Title.setBounds(240, 11, 289, 42);
//        frmPlayerJava.getContentPane().add(Title);

        getVideo();
//        JButton btnNewButton = new JButton("Play");
//        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
//        btnNewButton.setBounds(300, 400, 228, 79);
//        frmPlayerJava.getContentPane().add(btnNewButton);

//
//        btnNewButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
//                getVideo();
//            }
//
//            public void actionPerformed(ActionEvent arg0) {
//                getVideo();
//            }
//        });
    }

    private void getVideo(){
        File video_source = new File("/home/silla/Downloads/cartoon.mp4");
        Media m = new Media(video_source.toURI().toString());
        //Media m = new Media("https://www.youtube.com/embed/qzW6mgfY5X4");
        MediaPlayer player = new MediaPlayer(m);
        player.play();
        MediaControl mediaControl = new MediaControl(player);

        StackPane root = new StackPane();
        Scene scene = new Scene(root);
        scene.setRoot(mediaControl);

        // add video to stackpane
        videoPanel.setScene(scene);

    }
}
