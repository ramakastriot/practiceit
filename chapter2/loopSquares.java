/* Write a for loop that produces the following output:
 * 1 4 9 16 25 36 49 64 81 100
 * For added challenge, try to modify your code so that it does not need to 
 * use the * multiplication operator.
 */
for(int i = 1, inc = 3; i <= 100; inc += 2) {
    System.out.print(i + " ");
    i += inc;
}
