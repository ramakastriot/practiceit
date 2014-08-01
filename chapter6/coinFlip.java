/* Write a method named coinFlip that accepts as its parameter a Scanner for 
 * an input file. Assume that the input file data represents results of sets 
 * of coin flips that are either heads (H) or tails (T) in either upper or 
 * lower case, separated by at least one space. Your method should consider 
 * each line to be a separate set of coin flips and should output to the 
 * console the number of heads and the percentage of heads in that line, 
 * rounded to the nearest tenth. If this percentage is more than 50%, you 
 * should print a "You win" message. You may assume that the Scanner contains 
 * at least 1 line of input, that each line contains at least one token, and 
 * that no tokens other than h, H, t, or T will be in the lines.
 */
public void coinFlip(Scanner sc) {
    while(sc.hasNextLine()) {
        Scanner line = new Scanner(sc.nextLine());
        int h = 0;
        int t = 0;
        
        while(line.hasNext()) {
            String c = line.next().toLowerCase();
            if(c.equals("h")) {
                h++;
            } else {
                t++;
            }
        }
        
        double percent = (double) (h * 100) / (h + t);
        
        System.out.println(h + " heads (" + String.format("%.1f", percent) + 
            "%)");
        
        if(h > t)
            System.out.println("You win!");
        
        System.out.println();
    }
}
