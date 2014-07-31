/* Write a method called stripComments that accepts a Scanner representing an 
 * input file containing a Java program as its parameter, reads that file, and 
 * then prints the file's text with all comments removed.
 */
public void stripComments(Scanner sc) {
    boolean multiLineComment = false;
    
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        
        boolean singleLineComment = false;

        int i = 0;
        
        while(i < line.length()) {
            if(multiLineComment && i <= line.length() - 2 && 
                line.charAt(i) == '*' && line.charAt(i+1) == '/') {
                multiLineComment = false;
                i += 2;
            } else if(!singleLineComment && i <= line.length() - 2 && 
                line.charAt(i) == '/' && line.charAt(i+1) == '*') {
                multiLineComment = true;
                i += 2;
            } else if(!multiLineComment && i <= line.length() - 2 && 
                line.charAt(i) == '/' && line.charAt(i+1) == '/') {
                singleLineComment = true;
                i += 2;
            } else if(singleLineComment || multiLineComment) {
                i++;
            } else {
                System.out.print(line.charAt(i));
                i++;
            }
        }
        
        if(!multiLineComment)
            System.out.println();
    }
}
