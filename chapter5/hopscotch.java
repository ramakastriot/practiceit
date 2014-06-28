/* Write a method named hopscotch that accepts an integer parameter for a 
 * number of "hops" and prints a hopscotch board of that many hops. A "hop" is 
 * defined as the split into two numbers and then back together again into one.
 */
public void hopscotch(int n) {
    int current = 1;
    int total = 3 * n + 1;
    
    while(current < total) {
        if((current - 1) % 3 == 0) {
            System.out.println("   " + current);
            current++;
        } else {
            System.out.println(current + "     " + (current + 1));
            current += 2;
        }
    }
    
    System.out.println("   " + current);
}
