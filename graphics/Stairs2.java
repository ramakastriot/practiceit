/* Modify your Stairs program from the previous exercise to make a new class 
 * Stairs2 that draws the output shown below. Modify only the body of your loop.
 */
public class Stairs2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(110, 110);
        Graphics g = panel.getGraphics();
        for(int i = 0; i < 10; i++) {
            g.drawRect(5, 5 + 10 * i, 100 - 10 * i, 10);
        }
    }
}
