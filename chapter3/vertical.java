/* Write a method called vertical that accepts a String as its parameter and 
 * prints each letter of the string on separate lines.
 */
public void vertical(String str) {
    for(int i = 0; i < str.length(); i++)
        System.out.println(str.charAt(i));
}
