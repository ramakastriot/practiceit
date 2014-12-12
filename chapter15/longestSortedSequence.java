/* Write a method longestSortedSequence that returns the length of the longest 
 * sorted sequence within a list of integers. If the list is empty, your 
 * method should return 0.
 */
public int longestSortedSequence() {
    if(size == 0)
        return 0;

    int max = 1;
    int length = 1;

    for(int i = 1; i < size; i++) {
        if(elementData[i - 1] <= elementData[i]) {
            length++;
        } else {
            if(length > max) {
                max = length;
            }
            length = 1;
        }
    }

    return Math.max(max, length);
}
