/* Write a method called wordLengths that accepts a Scanner representing an 
 * input file as its argument. Your method should read from the given file, 
 * count the number of letters in each token in the file, and output a result 
 * diagram of how many words contain each number of letters. Use tabs before 
 * the asterisks so that they'll line up. If there are no words of a given 
 * length, omit that line from the output.
 */
public void wordLengths(Scanner sc) {
    int[] counts = new int[80];
    
    while(sc.hasNext()) {
        String str = sc.next();
        counts[str.length() - 1]++;
    }
    
    for(int i = 0; i < counts.length; i++) {
        if(counts[i] > 0) {
            System.out.print((i+1) + ": " + counts[i] + "\t");
            for(int j = 0; j < counts[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
