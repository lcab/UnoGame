import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {
   Image img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\loren\\Personal\\unocards\\background\\background.jpg");
   public Main() throws IOException {
      this.setContentPane(new JPanel() {
         @Override
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, null);
         }
      });

      pack();
      setVisible(true);
        Toolkit toolKit = getToolkit();
      Dimension size = toolKit.getScreenSize();
      //center the background
      setLocation(size.width/2- getWidth()/2, size.height/2 - getHeight()/2);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public static void main(String[] args) throws Exception {
      new Main();
   }
}