/* Write a method called wordWrap that accepts a Scanner representing an input 
 * file as its parameter and outputs each line of the file to the console, 
 * word-wrapping all lines that are longer than 60 characters.
 */
public void wordWrap(Scanner sc) {
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        
        while(line.length() > 60) {
            System.out.println(line.substring(0, 60));
            line = line.substring(60);
        }
        
        System.out.println(line);
    }
}
