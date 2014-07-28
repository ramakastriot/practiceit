/* Modify the preceding wordWrap method into a new wordWrap3 method that wraps 
 * only whole words, never chopping a word in half. Assume that a word is any 
 * whitespace-separated token and that all words are under 60 characters in 
 * length. Make sure that each time you wrap a line, the subsequent wrapped 
 * line(s) each begin with a word and not with any leading whitespace. Accept 
 * only a single parameter for the input Scanner, and send your method's 
 * output to the console.
 */
public void wordWrap3(Scanner sc) {
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        
        while(line.length() > 60) {
            int i = 60;
            
            while(!Character.isWhitespace(line.charAt(i)))
                i--;
            
            System.out.println(line.substring(0, i));
            
            while(i < line.length() && Character.isWhitespace(line.charAt(i)))
                i++;
            
            line = line.substring(i);
        }
        
        System.out.println(line);
    }
}
