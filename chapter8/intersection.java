/* Add the following method to your Rectangle class from the previous 
 * exercises:
 *
 * public Rectangle intersection(Rectangle rect)
 *
 * Returns a new rectangle that represents the largest rectangular region 
 * completely contained within both this rectangle and the given other 
 * rectangle. If the rectangles do not intersect at all, returns null. Your 
 * method should not modify the current Rectangle or the one that is passed in 
 * as a parameter; you should create and return a new rectangle.
 */
public Rectangle intersection(Rectangle rect) {
    if(this.getX() + this.getWidth() < rect.getX() ||
        rect.getX() + rect.getWidth() < this.getX() ||
        this.getY() + this.getHeight() < rect.getY() ||
        rect.getY() + rect.getHeight() < this.getY())
        return null;
        
    int startX = Math.max(this.getX(), rect.getX());
    int endX = Math.min(this.getX() + this.getWidth(),
        rect.getX() + rect.getWidth());
    int startY = Math.max(this.getY(), rect.getY());
    int endY = Math.min(this.getY() + this.getHeight(),
        rect.getY() + rect.getHeight());
        
    return new Rectangle(startX, startY, endX - startX, endY - startY);
}
