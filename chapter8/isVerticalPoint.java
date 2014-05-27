/* Add the following method to your Point class:
 *
 * public boolean isVertical(Point other)
 *
 * Returns true if the given Point lines up vertically with this Point; that 
 * is, if their x coordinates are the same.
 */
public boolean isVertical(Point other) {
    return this.x == other.x;
}
