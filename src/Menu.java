
import javax.swing.*;
import java.awt.*;

public class Menu extends javax.swing.JFrame {

    SideMenuPanel sp;

    public Menu() {

        initComponents();
        sp = new SideMenuPanel(this);
        sp.setMain(mainPanel);
        sp.setSide(sidebar);
        sp.setMinWidth(55);
        sp.setMaxWidth(150);
        sp.setMainAnimation(true);
        sp.setSpeed(4);
        sp.setResponsiveMinWidth(1000);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        settings = new javax.swing.JButton();
        news = new javax.swing.JButton();
        home = new javax.swing.JButton();
        men = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebar.setBackground(new java.awt.Color(16, 84, 129));
        sidebar.setPreferredSize(new java.awt.Dimension(80, 32));

        settings.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        settings.setForeground(new java.awt.Color(195, 217, 233));
        settings.setIcon(new javax.swing.ImageIcon(("/home/silla/Desktop/my-projects/scala/37.2/prioriri-queue/MSApp/src/settings (Custom).png"))); // NOI18N
        settings.setText("Movies");
        settings.setBorderPainted(false);
        settings.setContentAreaFilled(false);
        settings.setFocusPainted(false);
        settings.setHideActionText(true);
        settings.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        settings.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        settings.setIconTextGap(20);
        settings.setMargin(new java.awt.Insets(2, 0, 2, 14));
        settings.setMinimumSize(new java.awt.Dimension(0, 35));
        settings.setPreferredSize(new java.awt.Dimension(50, 574));

        home.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        home.setForeground(new java.awt.Color(195, 217, 233));
        home.setIcon(new javax.swing.ImageIcon(("/home/silla/Desktop/my-projects/scala/37.2/prioriri-queue/MSApp/src/home (Custom).png"))); // NOI18N
        home.setText("Cartoons");
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setHideActionText(true);
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        home.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        home.setIconTextGap(20);
        home.setMargin(new java.awt.Insets(2, 0, 2, 14));
        home.setMinimumSize(new java.awt.Dimension(0, 0));
        home.setPreferredSize(new java.awt.Dimension(50, 574));

        news.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        news.setForeground(new java.awt.Color(195, 217, 233));
        news.setIcon(new javax.swing.ImageIcon(("/home/silla/Desktop/my-projects/scala/37.2/prioriri-queue/MSApp/src/settings (Custom).png"))); // NOI18N
        news.setText("NEWS");
        news.setBorderPainted(false);
        news.setContentAreaFilled(false);
        news.setFocusPainted(false);
        news.setHideActionText(true);
        news.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        news.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        news.setIconTextGap(20);
        news.setMargin(new java.awt.Insets(2, 0, 2, 14));
        news.setMinimumSize(new java.awt.Dimension(0, 35));
        news.setPreferredSize(new java.awt.Dimension(50, 574));


        men.setBackground(new java.awt.Color(34, 40, 47));
        men.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        men.setIcon(new javax.swing.ImageIcon(("/home/silla/Desktop/my-projects/scala/37.2/prioriri-queue/MSApp/src/menu_15.png"))); // NOI18N
        men.setBorderPainted(false);
        men.setContentAreaFilled(false);
        men.setFocusPainted(false);
        men.setHideActionText(true);
        men.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        men.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        men.setIconTextGap(20);
        men.setMargin(new java.awt.Insets(2, 3, 2, 14));
        men.setMinimumSize(new java.awt.Dimension(0, 35));
        men.setPreferredSize(new java.awt.Dimension(50, 574));
        men.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(126, 170, 214));
        jLabel13.setText("<html>Credits to Ian Divingracia</html>");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
                sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(news, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(sidebarLayout.createSequentialGroup()
                                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(men, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(sidebarLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
                sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidebarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(men, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(news, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );

        mainPanel.setBackground(new java.awt.Color(210, 231, 255));

//        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
//        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
//        jLabel1.setText("Home");


        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));


       jButton1.setText("Login");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              //  jButton1ActionPerformed(evt);
                setJpanel1();
                jPanel1.setVisible(true);
                jPanel2.setVisible(false);
            }
        });

        jButton2.setText("Register");
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               // jButton2ActionPerformed(evt);
                jPanel1.setVisible(false);
                setJpanel2();
                jPanel2.setVisible(true);
            }
        });

      // setJpanel2();
        setJpanel1();
        pack();
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void setJpanel1() {
    jLabel7.setText("Side Menu Panel1");
    javax.swing.GroupLayout mainPanelLayout1 = new javax.swing.GroupLayout(mainPanel);
    mainPanel.setLayout(mainPanelLayout1);

    mainPanelLayout1.setHorizontalGroup(
            mainPanelLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout1.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(mainPanelLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout1.createSequentialGroup()
                                            .addGap(227, 227, 227)
                                            .addGroup(mainPanelLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    // .addComponent(jButton1)
                                                    //.addComponent(jButton2))
                                                    // .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(mainPanelLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(mainPanelLayout1.createSequentialGroup()
                                                                    .addComponent(jLabel2)
                                                                    .addGap(48, 48, 48))
                                                            .addGroup(mainPanelLayout1.createSequentialGroup()
                                                                    .addGroup(mainPanelLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(mainPanelLayout1.createSequentialGroup()
                                                                                    .addGap(23, 23, 23)
                                                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addComponent(jLabel7)
                                                                            .addComponent(jLabel3))
                                                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGroup(mainPanelLayout1.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addContainerGap()))))
    );
    mainPanelLayout1.setVerticalGroup(
            mainPanelLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout1.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addGroup(mainPanelLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    //   .addComponent(jButton1))
                                    // .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(mainPanelLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    // .addComponent(jButton2))
                                                    .addGap(32, 32, 32)
                                                    .addComponent(jLabel3)
                                                    //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            //.addContainerGap(71, Short.MAX_VALUE)
                                    ))
                    ));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);

    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    //playVideo();

}

    private void setJpanel2() {
        jLabel7.setText("Side Menu Panel2");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

//        pack();


    }

    private void menActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menActionPerformed
        // TODO add your handling code here:
        sp.onSideMenu();
    }//GEN-LAST:event_menActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sp.openMenu();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sp.closeMenu();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


//    private void playVideo() {
//        JFrame frame = new JFrame("VLCJ Player");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(800, 600);
//
//        EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
//        frame.setContentPane(mediaPlayerComponent);
//        frame.setVisible(true);
//
//        mediaPlayerComponent.mediaPlayer().media().play("/home/silla/Downloads/mixkit-baby-on-the-belly-of-his-mother-plays-and-smiles-4042-hd-ready.mp4");
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton men;
    private javax.swing.JButton settings;
    private javax.swing.JButton news;
    private javax.swing.JPanel sidebar;
  //  private EmbeddedMediaPlayerComponent mediaPlayerComponent;

    // End of variables declaration//GEN-END:variables
}