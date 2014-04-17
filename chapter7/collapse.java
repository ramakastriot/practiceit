/* Write a method called collapse that accepts an array of integers as a 
 * parameter and returns a new array containing the result of replacing each 
 * pair of integers with the sum of that pair. If the list stores an odd number
 * of elements, the final element is not collapsed. Your method should not 
 * change the array that is passed as a parameter.
 */
public int[] collapse(int[] a) {
    int[] r = new int[(a.length + 1) / 2];
    int i = 0;
    
    for(int j = 0; j <= a.length - 2; j += 2) {
        r[i] = a[j] + a[j+1];
        i++;
    }
    
    if(i != r.length)
        r[i] = a[a.length - 1];
        
    return r;
}
