/* Add the following method to your Line class from the previous exercise:
 *
 * public double getSlope()
 *
 * Returns the slope of this line. The slope of a line between points (x1, y1) 
 * and (x2, y2) is equal to (y2 - y1) / (x2 - x1). If the two points have the 
 * same x-coordinates, the denominator is zero and the slope is undefined, so 
 * you should throw an IllegalStateException in this case.
 */
public double getSlope() {
    if(p1.getX() == p2.getX())
        throw new IllegalStateException();
        
    return ((double)(p2.getY() - p1.getY())) / (p2.getX() - p1.getX());
}
