/* Write a class called Line that represents a line segment between two Points.
 * Your Line objects should have the following methods:
 *
 * public Line(Point p1, Point p2)
 *
 * Constructs a new line that contains the given two points.
 *
 * public Point getP1()
 *
 * Returns this line's first endpoint.
 *
 * public Point getP2()
 *
 * Returns this line's second endpoint.
 *
 * public String toString()
 *
 * Returns a string representation of this line, such as "[(22, 3), (4, 7)]".
 */
public class Line {
    Point p1;
    Point p2;
    
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Point getP1() {
        return p1;
    }
    
    public Point getP2() {
        return p2;
    }
    
    public String toString() {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }
}
