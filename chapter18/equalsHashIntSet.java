/* Write a method in the HashIntSet class called equals that accepts another 
 * object as a parameter and returns true if the object is another HashIntSet 
 * that contains exactly the same elements. The internal hash table size and 
 * ordering of the elements does not matter, only the sets of elements 
 * themselves.
 */
public boolean equals(Object object) {
    if(object instanceof HashIntSet) {
        HashIntSet set = (HashIntSet) object;

        if(size != set.size())
            return false;

        for(int i = 0; i < elementData.length; i++) {
            Node current = elementData[i];
            while(current != null) {
                if(!set.contains(current.data))
                    return false;
                current = current.next;
            }
        }

        return true;
    }

    return false;
}
