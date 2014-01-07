/* Write a complete Java program in a class named Stewie2 that prints the 
 * following output. Use at least one static method besides main to remove 
 * redundancy.
 * //////////////////////
 * || Victory is mine! ||
 * \\\\\\\\\\\\\\\\\\\\\\
 * || Victory is mine! ||
 * \\\\\\\\\\\\\\\\\\\\\\
 * || Victory is mine! ||
 * \\\\\\\\\\\\\\\\\\\\\\
 * || Victory is mine! ||
 * \\\\\\\\\\\\\\\\\\\\\\
 * || Victory is mine! ||
 * \\\\\\\\\\\\\\\\\\\\\\
 */
public class Stewie2 {
    public static void main(String[] args) {
        printForward();
        for(int i = 0; i < 5; i++)
            printVictory();
    }
                                        
    public static void printForward() {
        System.out.println("//////////////////////");
    }
                                                            
    public static void printVictory() {
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
