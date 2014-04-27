/* Write a method called printSquare that takes in two integer parameters, a 
 * min and a max, and prints the numbers in the range from min to max inclusive
 * in a square pattern. Each line of the square consists of a circular sequence
 * of increasing integers between min and max. Each line prints a different 
 * permutation of this sequence. The first line begins with min, the second 
 * line begins with min + 1, and so on. When the sequence in any line reaches 
 * max, it wraps around back to min. You may assume the caller of the method 
 * will pass a min and a max parameter such that min is less than or equal to 
 * max.
 */
public void printSquare(int min, int max) {
    for(int i = min; i <= max; i++) {
        int k = i;
        for(int j = min; j <= max; j++) {
            System.out.print(k);
            k = k == max ? min : k + 1;
        }
        System.out.println();
    }
}
