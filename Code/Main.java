import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
   
   Image img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\loren\\Personal\\unocards\\background\\background.jpg");

   public Main() throws IOException {
      setContentPane(new JPanel() {
         @Override
         protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
         }
      });

      pack();

      Toolkit toolKit = getToolkit();
      Dimension size = toolKit.getScreenSize();
      setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false); // Optional: To prevent resizing of the JFrame
      setVisible(true);
   }

   public static void main(String[] args) throws Exception {
      new Main();
   }
}
