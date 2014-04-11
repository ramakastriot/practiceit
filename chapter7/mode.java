/* Write a method called mode that returns the most frequently occurring 
 * element of an array of integers. Assume that the array has at least one 
 * element and that every element in the array has a value between 0 and 100 
 * inclusive. Break ties by choosing the lower value.
 */
public int mode(int[] n) {
    int[] counts = new int[101];
    int maxCount = 0;
    int maxKey = -1;
    
    for(int i = 0; i < n.length; i++) {
        counts[n[i]]++;
        if(counts[n[i]] > maxCount) {
            maxCount = counts[n[i]];
            maxKey = n[i];
        }
    }
    
    return maxKey;
}
