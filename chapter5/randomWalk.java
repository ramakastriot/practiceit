/* Write a method named randomWalk that performs a random one-dimensional 
 * walk, reporting each position reached and the maximum position reached 
 * during the walk. The random walk should begin at position 0. On each step, 
 * you should either increase or decrease the position by 1 (with equal 
 * probability). The walk stops when 3 or -3 is hit.
 */
public void randomWalk() {
    int position = 0;
    int max = 0;
    Random r = new Random();
    int step;
    
    while(-3 < position && position < 3) {
        System.out.println("position = " + position);
        step = r.nextBoolean() ? -1 : 1;
        position += step;
        max = Math.max(max, position);
    }
    
    System.out.println("position = " + position);
    System.out.println("max position = " + max);
}
