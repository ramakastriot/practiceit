/* Write a method called percentEven that accepts an array of integers as a 
 * parameter and returns the percentage of even numbers in the array as a real 
 * number.  If the array contains no even elements or no elements at all, 
 * return 0.0.
 */
public double percentEven(int[] a) {
    if(a.length == 0)
        return 0.0;
        
    int count = 0;
    
    for(int i = 0; i < a.length; i++) {
        if(a[i] % 2 == 0)
            count++;
    }
    
    return count * 100.0 / a.length;
}
