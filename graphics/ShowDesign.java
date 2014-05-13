/* Write a complete program in a class named ShowDesign that uses the 
 * DrawingPanel to draw the following figure:
 * The window is 200 pixels wide and 200 pixels tall. The background is white 
 * and the foreground is black. There are 20 pixels between each of the four 
 * rectangles, and the rectangles are concentric (their centers are at the 
 * same point). Use a loop to draw the repeated rectangles.
 */
public class ShowDesign {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 200);
        Graphics g = panel.getGraphics();
        for(int i = 0; i < 4; i++)
            g.drawRect(20 + 20 * i, 20 + 20 * i, 160 - 40 * i, 160 - 40 * i);
    }
}
