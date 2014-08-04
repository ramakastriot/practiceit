/* Write a static method named plusScores that accepts as a parameter a 
 * Scanner containing a series of lines that represent student records. Each 
 * student record takes up two lines of input. The first line has the 
 * student's name and the second line has a series of plus and minus 
 * characters. The number of plus/minus characters will vary, but you may 
 * assume that at least one such character appears and that no other 
 * characters appear on the second line of each pair. For each student you 
 * should produce a line of output with the student's name followed by a colon 
 * followed by the percent of plus characters.
 */
public void plusScores(Scanner sc) {
    while(sc.hasNextLine()) {
        String name = sc.nextLine();
        String scores = sc.nextLine();
        int plus = 0;
        int minus = 0;
        
        for(int i = 0; i < scores.length(); i++) {
            if(scores.charAt(i) == '+') {
                plus++;
            } else {
                minus++;
            }
        }
        
        double percent = (double) (plus * 100) / (plus + minus);
        System.out.println(name + ": " + String.format("%.1f", percent) + 
            "% plus");
    }
}
