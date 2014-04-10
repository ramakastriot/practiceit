/* Write a method called countInRange that accepts an array of integers, a 
 * minimum value, and a maximum value as parameters and returns the count of 
 * how many elements from the array fall between the minimum and maximum 
 * (inclusive).
 */
public int countInRange(int[] arr, int min, int max) {
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
        if(min <= arr[i] && arr[i] <= max)
            count++;
    }
    
    return count;
}
