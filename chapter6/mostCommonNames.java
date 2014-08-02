/* Write a method named mostCommonNames that accepts as its parameter a 
 * Scanner for an input file whose data is a sequence of lines, where each 
 * line contains a set of first names separated by spaces. Your method should 
 * print the name that occurs the most frequently in each line of the file. 
 * The method should also return the total number of unique names that were 
 * seen in the file. You may assume that no name appears on more than one line 
 * of the file. Each line should be considered separately from the others. On 
 * a given line, some names are repeated; all occurrences of a given name will 
 * appear consecutively in the file. If two or more names occur the same number
 * of times, print the one that appears earlier in the file. If every single 
 * name on a given line is different, every name will have 1 occurrence, so 
 * you should just print the first name in the file. You may assume that there 
 * is at least one line of data in the file and that each line will contain at 
 * least one name.
 */
public int mostCommonNames(Scanner sc) {
    int unique = 0;
    
    while(sc.hasNextLine()) {
        Scanner line = new Scanner(sc.nextLine());
        
        unique++;
        int maxCount = 1;
        String maxName = line.next();
        int count = 1;
        String prevName = maxName;

        
        while(line.hasNext()) {
            String currentName = line.next();
            
            if(currentName.equals(prevName)) {
                count++;
            } else {
                if(count > maxCount) {
                    maxCount = count;
                    maxName = prevName;
                }
                
                unique++;
                count = 1;
                prevName = currentName;
            }
        }
        
        if(count > maxCount)
            maxName = prevName;
        
        System.out.println("Most common: " + maxName);
    }
    
    return unique;
}
