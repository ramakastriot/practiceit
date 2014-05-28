/* Add the following method to the Point class:
 *
 * public void flip()
 *
 * Negates and swaps the x/y coordinates of the Point object.
 */
public void flip() {
    int temp = this.x;
    this.x = -this.y;
    this.y = -temp;
}
