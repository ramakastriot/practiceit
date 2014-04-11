/* Write a static method named isSorted that accepts an array of doubles as a 
 * parameter and returns true if the list is in sorted (nondecreasing) order 
 * and false otherwise. Assume the array has at least one element. A 
 * one-element array is considered to be sorted.
 */
public boolean isSorted(double[] arr) {
    for(int i = 0; i <= arr.length - 2; i++) {
        if(arr[i + 1] < arr[i])
            return false;
    }
    return true;
}
