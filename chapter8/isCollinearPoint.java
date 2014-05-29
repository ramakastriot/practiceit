/* Add the following method to the Point class:
 *
 * public boolean isCollinear(Point p1, Point p2)
 *
 * Returns whether this Point is collinear with the given two other points.
 * Since Java's double type is imprecise, round all slope values to a 
 * reasonable accuracy such as four digits past the decimal point before you 
 * compare them.
 */
public boolean isCollinear(Point p1, Point p2) {
    if(this.x == p1.x || this.x == p2.x)
        return this.x == p1.x && this.x == p2.x;
        
    double m1 = ((double) (this.y - p1.y)) / (this.x - p1.x);
    double m2 = ((double) (this.y - p2.y)) / (this.x - p2.x);
    
    if(m1 == m2)
        return true;
        
    return false;
}
