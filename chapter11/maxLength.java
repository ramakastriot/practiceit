/* Write a method maxLength that takes a Set of strings as a parameter and 
 * that returns the length of the longest string in the set. If your method is 
 * passed an empty set, it should return 0.
 */
public int maxLength(Set<String> set) {
    int maxLength = 0;

    for(String str : set) {
        if(maxLength < str.length()) {
            maxLength = str.length();
        }
    }

    return maxLength;
}
