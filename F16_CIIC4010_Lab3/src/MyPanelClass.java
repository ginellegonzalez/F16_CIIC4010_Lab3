import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.CYAN);
                        g.fillRect(x1, y1, width+1, height+1);
                        
//                        //Draw a border
//                        g.setColor(Color.MAGENTA);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //inside border
//                        g.setColor(Color.DARK_GRAY);
//                        g.drawRect(x1+2, y1+2, width-4, height-4);
//                        
//                        //diagonal line from left
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //diagonal line from right
//                        g.setColor(Color.ORANGE);
//                        g.drawLine(x2, y1, x1, y2);
                        
                        //OVAL
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval((width/2)-27,(height/2)-27, 55, 55);
                        
                        
            }
}