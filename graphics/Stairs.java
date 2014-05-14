/* Finish the given program called Stairs that uses the DrawingPanel to draw 
 * the figure shown below. The window is 110 x 110 px in size. The first 
 * stair's top-left corner is at position (5, 5). The first stair is 10 x 10 
 * pixels in size. Each stair is 10 pixels wider than the one above it.
 */
public class Stairs {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(110, 110);
        Graphics g = panel.getGraphics();
        for(int i = 0; i < 10; i++) {
            g.drawRect(5, 5 + 10 * i, 10 + 10 * i, 10);
        }
    }
}
