/* Modify your ShowDesign class from the previous exercise into a new class 
 * ShowDesign2 that has a method named showDesign that accepts parameters for 
 * the window width and height and displays the rectangles at the appropriate 
 * sizes.
 */
public class ShowDesign2 {
    public static void main(String[] args) {
        showDesign(300, 100);
    }
    
    public static void showDesign(int width, int height) {
        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();
        for(int i = 1; i <= 4; i++)
            g.drawRect(30 * i, 10 * i, width - 60 * i, height - 20 * i);
    }
}
