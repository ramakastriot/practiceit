/* Write a method named lastIndexOf that accepts an array of integers and an 
 * integer value as its parameters and returns the last index at which the 
 * value occurs in the array. The method should return -1 if the value is not 
 * found.
 */
public int lastIndexOf(int[] arr, int val) {
    for(int i = arr.length - 1; i >= 0; i--) {
        if(arr[i] == val)
            return i;
    }
    return -1;
}
