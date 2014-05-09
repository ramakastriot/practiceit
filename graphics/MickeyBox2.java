/* Modify your MickeyBox program from the previous exercise into a new class 
 * MickeyBox2 so that the figure is drawn by a method called drawFigure. The 
 * method should accept two parameters: the Graphics g of the DrawingPanel on 
 * which to draw, and two ints specifying the (x, y) position of the top-left 
 * corner of the figure. Set your DrawingPanel's size to 450 x 150 pixels, and 
 * use your drawFigure method to place two figures on it. One figure should be 
 * at position (50, 25) and the other should be at position (250, 45).
 */
public class MickeyBox2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(450, 150);
        Graphics g = panel.getGraphics();
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 450, 150);
        drawFigure(g, 50, 25);
        drawFigure(g, 250, 45);
    }
    
    public static void drawFigure(Graphics g, int x, int y) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 40, 40);
        g.fillOval(x + 80, y, 40, 40);
        g.setColor(Color.RED);
        g.fillRect(x + 20, y + 20, 80, 80);
        g.setColor(Color.BLACK);
        g.drawLine(x + 20, y + 60, x + 100, y + 60);        
    }
}
