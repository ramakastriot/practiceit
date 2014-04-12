/* Write a method called median that accepts an array of integers as its 
 * argument and returns the median of the numbers in the array. The median is 
 * the number that will appear in the middle if you arrange the elements in 
 * order. Assume that the array is of odd size (so that one sole element 
 * constitutes the median) and that the numbers in the array are between 0 and 
 * 99 inclusive.
 */
public int median(int[] a) {
    return select(a, 0, a.length - 1, (a.length + 1) / 2);
}

public int select(int[] a, int p, int r, int i) {
    int q = partition(a, p, r);
    int k = q - p + 1;
    
    if(i == k)
        return a[q];
        
    if(i < k)
        return select(a, p, q - 1, i);
        
    return select(a, q + 1, r, i - k);
}

public int partition(int[] a, int p, int r) {
    int x = a[r];
    int i = p - 1;
    int temp;
    
    for(int j = p; j <= r - 1; j++) {
        if(a[j] <= x) {
            i++;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    
    temp = a[i + 1];
    a[i + 1] = a[r];
    a[r] = temp;
    return i + 1;
}
