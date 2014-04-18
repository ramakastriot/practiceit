/* Write a method called append that accepts two integer arrays as parameters 
 * and returns a new array that contains the result of appending the second 
 * array's values at the end of the first array.
 */
public int[] append(int[] list1, int[] list2) {
    int[] a = new int[list1.length + list2.length];
    int i = 0;
    
    for(int j = 0; j < list1.length; j++) {
        a[i] = list1[j];
        i++;
    }
    
    for(int j = 0; j < list2.length; j++) {
        a[i] = list2[j];
        i++;
    }
    
    return a;
}
