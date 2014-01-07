/* Write a program in a class named Shining that prints the following line of 
 * output 1000 times:
 * All work and no play makes Jack a dull boy.
 */
public class Shining {
    public static void main(String[] args) {
        printFiveHundred();
        printFiveHundred();
    }
    
    public static void printFiveHundred() {
        printOneHundred();
        printOneHundred();
        printOneHundred();
        printOneHundred();
        printOneHundred();
    }
    
    public static void printOneHundred() {
        printFifty();
        printFifty();
    }
    
    public static void printFifty() {
        printTen();
        printTen();
        printTen();
        printTen();
        printTen();
    }
    
    public static void printTen() {
        printFive();
        printFive();
    }
    
    public static void printFive() {
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
    }
}
