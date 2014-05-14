/* Modify your Squares2 program from the previous exercise into a new class 
 * Squares3 that draws the following figures. Parameterize your program so 
 * that the figures have the sizes shown below. The top-right figure has size 
 * 50, and the bottom-right figure has size 180.
 */
public class Squares3 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 300);
        Graphics g = panel.getGraphics();
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 400, 300);
        drawFigure(g, 50, 50, 100);
        drawFigure(g, 250, 10, 50);
        drawFigure(g, 180, 115, 180);
    }
    
    public static void drawFigure(Graphics g, int x, int y, int size) {
        int separation = size / 5;
        g.setColor(Color.RED);
        
        for(int i = 1; i <= 5; i++)
            g.drawRect(x, y, separation * i, separation * i);
            
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x + size, y + size);
    }
}
