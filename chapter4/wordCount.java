/* Write a method called wordCount that accepts a String as its parameter and 
 * returns the number of words in the String. A word is a sequence of one or 
 * more nonspace characters.
 */
public int wordCount(String str) {
    String[] arr = str.split("\\s+");
    int count = 0;
    
    for(String s : arr) {
        if(s.length() > 0)
            count++;
    }
    
    return count;
}
