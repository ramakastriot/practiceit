/* Write a method called stripHtmlTags that accepts a Scanner representing an 
 * input file containing an HTML web page as its parameter, then reads that 
 * file and prints the file's text with all HTML tags removed. A tag is any 
 * text between the characters < and >. You may assume that the file is a 
 * well-formed HTML document and that there are no < or > characters inside 
 * tags.
 */
public void stripHtmlTags(Scanner sc) {
    while(sc.hasNextLine()) {
        String htmlLine = sc.nextLine();
        
        boolean print = true;
        
        for(int i = 0; i < htmlLine.length(); i++) {
            if(htmlLine.charAt(i) == '<') {
                print = false;
            } else if(htmlLine.charAt(i) == '>') {
                print = true;
            } else if(print) {
                System.out.print(htmlLine.charAt(i));
            }
        }
        
        System.out.println();
    }
}
