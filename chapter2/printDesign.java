/* Write a method called printDesign that produces the following output. Use 
 * nested for loops to capture the structure of the figure.
 *
 * -----1-----
 * ----333----
 * ---55555---
 * --7777777--
 * -999999999-
 */
public static void printDesign() {
    for(int i = 1; i <= 9; i+=2) {
        for(int j = 0; j < (11 - i) / 2; j++)
            System.out.print("-");
            
        for(int j = 0; j < i; j++)
            System.out.print(i);
            
        for(int j = 0; j < (11 - i) / 2; j++)
            System.out.print("-");
            
        System.out.println();
    }
}
