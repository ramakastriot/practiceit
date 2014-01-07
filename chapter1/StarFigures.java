/* Write a complete Java program in a class named StarFigures that generates 
 * the following output. Use static methods to show structure and eliminate 
 * redundancy in your solution.
 * *****
 * *****
 *  * *
 *   *
 *  * *
 *
 * *****
 * *****
 *  * *
 *   *
 *  * *
 * *****
 * *****
 * 
 *   *
 *   *
 *   *
 * *****
 * *****
 *  * *
 *   *
 *  * *
 */
public class StarFigures {
    public static void main(String[] args) {
        printLines();
        printX();
        System.out.println();
        printLines();
        printX();
        printLines();
        System.out.println();
        printThreeStars();
        printLines();
        printX();
    }
                                                                                            
    public static void printLines() {
        System.out.println("*****");
        System.out.println("*****");
    }
                                                                                                                        
    public static void printX() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
                                                                                                                                                            
    public static void printThreeStars() {
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}
