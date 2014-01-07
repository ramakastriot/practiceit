/* Write a complete Java program in a class named Lanterns that generates the 
 * following three figures of output. Use static methods to show structure and 
 * eliminate redundancy in your solution.
 *     *****
 *   *********
 * *************
 *
 *     *****
 *   *********
 * *************
 * * | | | | | *
 * *************
 *     *****
 *   *********
 * *************
 *
 *     *****
 *   *********
 * *************
 *     *****
 * * | | | | | *
 * * | | | | | *
 *     *****
 *     *****
 */
public class Lanterns {
    public static void main(String[] args) {
        printTwoTriangles();
        printBars();
        printLine();
        printTwoTriangles();
        printFiveStars();
        printBars();
        printBars();
        printFiveStars();
        printFiveStars();
    }
    
    public static void printTwoTriangles() {
        printTriangle();
        System.out.println();
        printTriangle();
    }
    
    public static void printTriangle() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    
    public static void printBars() {
        System.out.println("* | | | | | *");
    }
                                                                                    public static void printLine() {
        System.out.println("*************");
    }
    
    public static void printFiveStars() {
        System.out.println("    *****");
    }
}
