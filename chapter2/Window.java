/* Write a Java program in a class named Window that produces the preceding 
 * figure as output. Use nested for loops to print the repeated parts of the 
 * figure. Once you get it to work, add one class constant to your program so 
 * that the size of the figure can be changed simply by changing that 
 * constant's value. The example output shown is at a constant size of 3, but 
 * if you change the constant, the figure should grow larger and wider 
 * proportionally.
 */
public class Window {
    public static final int SIZE = 3;
    
    public static void main(String[] args) {
        printLine();
        System.out.println();
        printWindow();
        printLine();
        System.out.println();
        printWindow();
        printLine();
    }
    
    public static void printLine() {
        System.out.print("+");
        
        for(int i = 0; i < SIZE; i++)
            System.out.print("=");
            
        System.out.print("+");
        
        for(int i = 0; i < SIZE; i++)
            System.out.print("=");
            
        System.out.print("+");
    }
    
    public static void printWindow() {
        for(int i = 0; i < SIZE; i++) {
            System.out.print("|");
            
            for(int j = 0; j < SIZE; j++)
                System.out.print(" ");
                
            System.out.print("|");
            
            for(int j = 0; j < SIZE; j++)
                System.out.print(" ");
                
            System.out.print("|");
            System.out.println();
        }
    }
}
