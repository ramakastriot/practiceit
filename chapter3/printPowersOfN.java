/* Write a method called printPowersOfN that accepts a base and an exponent as 
 * arguments and prints each power of the base from 0 up to that maximum power,
 * inclusive. You may assume that the exponent passed to printPowersOfN has a 
 * value of 0 or greater.
 */
public void printPowersOfN(int base, int exp) {
    for(int i = 0; i <= exp; i++)
        System.out.print(((int) Math.pow(base, i)) + " ");
}
