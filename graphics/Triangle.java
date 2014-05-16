/* Using the DrawingPanel class, write a Java class named Triangle that 
 * produces the following figure:
 * - size: 600x200
 * - background color: yellow
 * - line color: blue
 * - vertical spacing between lines: 10 px
 */
public class Triangle {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(600, 200);
        Graphics g = panel.getGraphics();
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 600, 200);
        g.setColor(Color.BLUE);
        
        for(int y = 10; y < 200; y += 10) {
            int x1 = 3 * y / 2;
            int x2 = 3 * (400 - y) / 2;
            g.drawLine(x1, y, x2, y);
        }
        
        g.drawLine(0, 0, 300, 200);
        g.drawLine(300, 200, 600, 0);
    }
}
