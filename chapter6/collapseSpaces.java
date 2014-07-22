/* Write a static method named collapseSpaces that accepts a Scanner 
 * representing a file as a parameter and writes that file's text to the 
 * console, with multiple spaces or tabs reduced to single spaces between 
 * words that appear on the same line. Each word is to appear on the same line 
 * in output as it appears in the file. Notice that lines can be blank.
 */
public void collapseSpaces(Scanner sc) {
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        Scanner linesc = new Scanner(line);
        
        while(linesc.hasNext())
            System.out.print(linesc.next() + " ");
        
        System.out.println();
    }
}
