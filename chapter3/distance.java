/* Write a method called distance that accepts four integer coordinates x1, y1,
 * x2, and y2 as parameters and computes the distance between points (x1, y1) 
 * and (x2, y2) on the Cartesian plane.
 */
public double distance(int x1, int y1, int x2, int y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
}
