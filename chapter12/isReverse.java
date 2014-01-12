/* Write a recursive method isReverse that accepts two strings as a parameter 
 * and returns true if the two strings contain the same sequence of characters 
 * as each other but in the opposite order (ignoring capitalization), and 
 * false otherwise.
 */
public boolean isReverse(String str1, String str2) {
    if(str1.length() != str2.length())
        return false;
        
    if(str1.length() == 0)
        return true;
        
    char c1 = Character.toLowerCase(str1.charAt(0));
    char c2 = Character.toLowerCase(str2.charAt(str2.length()-1));
    return c1 == c2 && 
        isReverse(str1.substring(1), str2.substring(0, str2.length()-1));
}
