/* Add the following method to the Point class:
 * public int quadrant()
 *
 * Returns which quadrant of the x/y plane this Point object falls in. 
 * Quadrant 1 contains all points whose x and y values are both positive. 
 * Quadrant 2 contains all points with negative x but positive y. Quadrant 3 
 * contains all points with negative x and y values. Quadrant 4 contains all 
 * points with positive x but negative y. If the point lies directly on the x 
 * and/or y axis, return 0.
 */
public int quadrant() {
    if(this.y > 0 && this.x > 0) {
        return 1;
    } else if(this.x < 0 && this.y > 0) {
        return 2;
    } else if(this.x < 0 && this.y < 0) {
        return 3;
    } else if(this.x > 0 && this.y < 0) {
        return 4;
    } else {
        return 0;
    }
}
