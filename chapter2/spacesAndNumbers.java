/* Write nested for loops to produce the following output:
 *
 *     1
 *    22
 *   333
 *  4444
 * 55555
 */
for(int i = 1; i <= 5; i++) {
    for(int j = 5 - i; j > 0; j--)
        System.out.print(" ");
        
    for(int j = 0; j < i; j++)
        System.out.print(i);
        
    System.out.println();
}
