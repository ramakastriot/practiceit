/* Write a static method named vowelCount that accepts a String as a parameter 
 * and produces and returns an array of integers representing the counts of 
 * each vowel in the String. The array returned by your method should hold 5 
 * elements: the first is the count of As, the second is the count of Es, the 
 * third Is, the fourth Os, and the fifth Us. Assume that the string contains 
 * no uppercase letters.
 */
public int[] vowelCount(String str) {
    int[] counts = new int[5];
    
    for(int i = 0; i < str.length(); i++) {
        switch(str.charAt(i)) {
            case 'a':
            counts[0]++;
            break;
            
            case 'e':
            counts[1]++;
            break;
            
            case 'i':
            counts[2]++;
            break;
            
            case 'o':
            counts[3]++;
            break;
            
            case 'u':
            counts[4]++;
            break;
        }
    }
    
    return counts;
}
