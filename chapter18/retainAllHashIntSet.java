/* Write a method in the HashIntSet class called retainAll that accepts 
 * another hash set as a parameter and removes all elements from this set that 
 * are not contained in the other set.
 */
public void retainAll(HashIntSet set) {
    for(int i = 0; i < elementData.length; i++) {
        Node prev = null;
        Node current = elementData[i];

        while(current != null) {
            if(!set.contains(current.data)) {
                if(prev == null)
                    elementData[i] = current.next;
                else
                    prev.next = current.next;

                size--;
                break;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }
}
