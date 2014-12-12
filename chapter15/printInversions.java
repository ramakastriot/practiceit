/* Write a method printInversions that lists all inversions in a list of 
 * integers. An inversion is defined as a pair of numbers where the first 
 * appears before the second in the list, but the first is greater than the 
 * second. You may assume that the list has no duplicates.
 */
public void printInversions() {
    for(int i = 0; i <= size - 2; i++) {
        for(int j = i+1; j < size; j++) {
            if(elementData[i] > elementData[j])
                System.out.println("(" + elementData[i] + ", " +
                    elementData[j] + ")");
        }
    }
}
