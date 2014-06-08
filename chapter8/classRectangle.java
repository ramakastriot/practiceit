/* Write a class called Rectangle that represents a rectangular two-dimensional
 * region. Your Rectangle objects should have the following methods:
 *
 * public Rectangle(int x, int y, int width, int height)
 *
 * Constructs a new rectangle whose top-left corner is specified by the given 
 * coordinates and with the given width and height. Throw an 
 * IllegalArgumentException on a negative width or height.
 *
 * public int getHeight()
 * Returns this rectangle's height.
 *
 * public int getWidth()
 * Returns this rectangle's width.
 *
 * public int getX()
 * Returns this rectangle's x-coordinate.
 *
 * public int getY()
 * Returns this rectangle's y-coordinate.
 *
 * public String toString()
 * Returns a string representation of this rectangle, such as 
 * "Rectangle[x=1,y=2,width=3,height=4]".
 */
public class Rectangle {
    int x;
    int y;
    int width;
    int height;
    
    public Rectangle(int x, int y, int width, int height) {
        if(width < 0 || height < 0)
            throw new IllegalArgumentException();
            
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height="
            + height + "]";
    }
}
