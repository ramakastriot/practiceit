/* Write a method called cylinderSurfaceArea that accepts a radius and height 
 * (both real numbers) as parameters and returns the surface area of a 
 * cylinder with those dimensions.
 */
public double cylinderSurfaceArea(double r, double h) {
    return 2 * Math.PI * r * r + 2 * Math.PI * r * h;
}
