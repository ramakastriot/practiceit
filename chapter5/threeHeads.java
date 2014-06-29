/* Write a method named threeHeads that repeatedly flips a coin until three 
 * heads in a row are seen. You should use a Random object to give an equal 
 * chance to a head or a tail appearing. Each time the coin is flipped, what 
 * is seen is displayed (H for heads, T for tails). When 3 heads in a row are 
 * flipped a congratulatory message is printed.
 */
public void threeHeads() {
    Random r = new Random();
    int count = 0;
    while(count < 3) {
        boolean head = r.nextBoolean();
        if(head) {
            System.out.print("H ");
            count++;
        } else {
            System.out.print("T ");
            count = 0;
        }
    }
    System.out.println("\nThree heads in a row!");
}
