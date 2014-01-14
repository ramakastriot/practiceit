/* Write nested for loops that produce the following output:
 *
 * 000111222333444555666777888999
 * 000111222333444555666777888999
 * 000111222333444555666777888999
 */
for(int i = 0; i < 3; i++) {
    for(int j = 0; j <= 9; j++) {
        for(int k = 0; k < 3; k++)
            System.out.print(j);
    }
    System.out.println();
}
