/* Modify your code from the previous exercise so that it could easily be 
 * modified to display a different range of numbers (instead of 1234567890) 
 * and a different number of repetitions of those numbers (instead of 60 total 
 * characters), with the vertical bars still matching up correctly. Write a 
 * complete class named NumbersOutput. Use two class constants instead of 
 * "magic numbers,", with one constant set to 6 for the number of repetitions, 
 * and the other set to 10 for the range of numbers. Put the for loop code in 
 * your class's main method.
 */
public class NumbersOutput {
    public static final int NUM_REPETITIONS = 6;
    public static final int NUM_RANGE = 10;
    
    public static void main(String[] args) {
        for(int i = 0; i < NUM_REPETITIONS; i++) {
            for(int j = 0; j < NUM_RANGE - 1; j++)
                System.out.print(" ");
                
            System.out.print("|");
        }
        
        System.out.println();
        
        for(int i = 1; i <= NUM_REPETITIONS * NUM_RANGE; i++)
            System.out.print(i % NUM_RANGE);
    }
}
