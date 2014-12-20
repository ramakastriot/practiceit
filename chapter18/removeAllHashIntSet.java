/* Write a method in the HashIntSet class called removeAll that accepts 
 * another hash set as a parameter and ensures that this set does not contain 
 * any of the elements from the other set.
 */
public void removeAll(HashIntSet set) {
    for(int i = 0; i < set.elementData.length; i++) {
        Node current = set.elementData[i];
        while(current != null) {
            remove(current.data);
            current = current.next;
        }
    }
}
