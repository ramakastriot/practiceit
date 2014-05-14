/* Write a program in a class named Squares that uses the DrawingPanel to draw 
 * the following figure:
 * The drawing panel is 300 pixels wide by 200 pixels high. Its background is 
 * cyan. The horizontal and vertical lines are drawn in red and the diagonal 
 * line is drawn in black. The upper-left corner of the diagonal line is at 
 * (50,50). Successive horizontal and vertical lines are spaced 20 pixels apart.
 */
public class Squares {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 200);
        Graphics g = panel.getGraphics();
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 300, 200);
        g.setColor(Color.RED);
        
        for(int i = 1; i <= 5; i++)
            g.drawRect(50, 50, 20 * i, 20 * i);
            
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 150, 150);
    }
}
