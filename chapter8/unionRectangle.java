/* Add the following method to your Rectangle class from the previous
 * exercises:
 *
 * public Rectangle union(Rectangle rect)
 *
 * Returns a new Rectangle that represents the area occupied by the tightest 
 * bounding box that contains both this Rectangle and the given other 
 * Rectangle. Your method should not modify the current Rectangle or the one 
 * that is passed in as a parameter; you should create and return a new 
 * rectangle.
 */
public Rectangle union(Rectangle rect) {
    int newX = Math.min(this.getX(), rect.getX());
    int newY = Math.min(this.getY(), rect.getY());
    int newWidth = Math.max(rect.getX() + rect.getWidth() - newX,
        this.getX() + this.getWidth() - newX);
    int newHeight = Math.max(rect.getY() + rect.getHeight() - newY,
        this.getY() + this.getHeight() - newY);
    return new Rectangle(newX, newY, newWidth, newHeight);
}
