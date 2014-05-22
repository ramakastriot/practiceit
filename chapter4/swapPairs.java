/* Write a method called swapPairs that accepts a String as a parameter and 
 * returns that String with each pair of adjacent letters reversed. If the 
 * String has an odd number of letters, the last letter is unchanged.
 */
public String swapPairs(String str) {
    char[] arr = str.toCharArray();
    
    for(int i = 0; i <= arr.length - 2; i += 2) {
        char temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    
    return new String(arr);
}
