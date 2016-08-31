import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
		g.setColor(Color.WHITE);
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
		                          // g.setColor(Color.LIGHT_GRAY);
		                          // g.fillOval((width/2)-27,(height/2)-27, 55, 55);
		
//								   Polygon p = new Polygon();
//						           p.addPoint(x1 + 5, y1 + 25);
//						           p.addPoint(x1 + 20, y1 + 10);
//						           p.addPoint(x1 + 35, y1 + 25);
//						           p.addPoint(x1 + 25, y1 + 25);
//						           p.addPoint(x1 + 25, y1 + 45);
//						           p.addPoint(x1 + 15, y1 + 45);
//						           p.addPoint(x1 + 15, y1 + 25);
//						           g.setColor(Color.YELLOW);
//						           g.fillPolygon(p);
		
									//franjas ROJAS
									Polygon p4 = new Polygon();
									p4.addPoint(x1, y1);
									p4.addPoint(x1, y1+37);
									p4.addPoint(x1+250, y1+37);
									p4.addPoint(x1+250, y1);
									g.setColor(Color.RED);
									g.fillPolygon(p4);
		
		
		
		
		
		
		
		
		
									//triangle 
									Polygon p3 = new Polygon();
									p3.addPoint(x1, y1);
									p3.addPoint(x1+125, y1+89);
									p3.addPoint(x1, y1+178);
									g.setColor(Color.BLUE);
									g.fillPolygon(p3);
									
									Polygon p2 = new Polygon();
							        p2.addPoint(x1 + 25, y1 + 73);
							        p2.addPoint(x1 + 41, y1 + 73);
							        p2.addPoint(x1 + 47, y1 + 58);
							        p2.addPoint(x1 + 53, y1 + 73);
							        p2.addPoint(x1 + 69, y1 + 73);
							        p2.addPoint(x1 + 56, y1 + 83);
							        p2.addPoint(x1 + 61, y1 + 98);
							        p2.addPoint(x1 + 47, y1 + 88);
							        p2.addPoint(x1 + 34, y1 + 98);
							        p2.addPoint(x1 + 38, y1 + 83);
							        g.setColor(Color.WHITE);
							        g.fillPolygon(p2);
	}
}