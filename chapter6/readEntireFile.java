/* Write a method named readEntireFile that accepts a Scanner representing an 
 * input file as its parameter, then reads that file and returns the entire 
 * text contents of that file as a String.
 */
public String readEntireFile(Scanner sc) {
    StringBuilder text = new StringBuilder();
    
    while(sc.hasNextLine()) {
        text.append(sc.nextLine() + "\n");
    }
    
    return text.toString();
}
