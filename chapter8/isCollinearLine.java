/* Add the following method to your Line class:
 *
 * public boolean isCollinear(Point p)
 *
 * Returns true if the given point is collinear with the points of this line; 
 * that is, if, when this Line is stretched infinitely, it would eventually 
 * hit the given point.
 */
public boolean isCollinear(Point p) {
    if(p1.getX() == p2.getX())
        return p.getX() == p1.getX();
        
    double m1 = ((double) (p.getY() - p1.getY())) / (p.getX() - p1.getX());
    double m2 = ((double) (p.getY() - p2.getY())) / (p.getX() - p2.getX());
    
    return m1 == m2;
}
