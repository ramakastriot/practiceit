/* Write a method named inputStats that takes a Scanner representing a file as 
 * a parameter and that reports various statistics about the file's text. In 
 * particular, your method should report the number of lines in the file, the 
 * longest line, the number of tokens on each line, and the length of the 
 * longest token on each line. You may assume that the input file has at least 
 * one line of input and that each line has at least one token.
 */
public void inputStats(Scanner sc) {
    String longestLine = "";
    int lineNum = 0;
    
    while(sc.hasNextLine()) {
        lineNum++;
        String line = sc.nextLine();
        Scanner lineSc = new Scanner(line);
        int count = 0;
        int longestToken = 0;
        
        while(lineSc.hasNext()) {
            String token = lineSc.next();
            count++;
            
            if(token.length() > longestToken)
                longestToken = token.length();
        }
        
        System.out.println("Line " + lineNum + " has " + count + 
            " tokens (longest = " + longestToken + ")");
        
        if(line.length() > longestLine.length())
            longestLine = line;
    }
    
    System.out.println("Longest line: " + longestLine);
}
