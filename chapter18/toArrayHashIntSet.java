/* Write a method in the HashIntSet class called toArray that returns the 
 * elements of the set as a filled array. The order of the elements in the 
 * array is not important as long as all elements from the set are present in 
 * the array, with no extra empty slots before or afterward.
 */
public int[] toArray() {
    int[] result = new int[size];
    int index = 0;

    for(int i = 0; i < elementData.length; i++) {
        Node current = elementData[i];

        while(current != null) {
            result[index] = current.data;
            index++;
            current = current.next;
        }
    }

    return result;
}
