/* Write a program in a class named Spiral that uses the DrawingPanel to draw 
 * the following figure:The window is 170 pixels wide and 170 pixels tall. The 
 * background is white and the spiral is black. The "spiral" lines start from 
 * (0, 10), going right 160, down 150, left 150, up 140, right 140, down 130, 
 * left 130, up 120, ...
 */
public class Spiral {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(170, 170);
        Graphics g = panel.getGraphics();
        
        int len = 160;
        int startX = 0;
        int startY = 10;
        int endX = startX;
        int endY = startY;
        int i = 0;
        
        while(len > 0) {
            switch(i % 4) {
                case 0:
                endX += len;
                endY = startY;
                len -= 10;
                break;
                
                case 1:
                endX = startX;
                endY += len;
                break;
                
                case 2:
                endX -= len;
                endY = startY;
                len -= 10;
                break;
                
                case 3:
                endX = startX;
                endY -= len;
                break;
            }

            g.drawLine(startX, startY, endX, endY);
            startX = endX;
            startY = endY;
            i++;
        }
    }
}
