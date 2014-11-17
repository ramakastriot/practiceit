/* Write a method called interleave that accepts two ArrayLists of integers a1 
 * and a2 as parameters and inserts the elements of a2 into a1 at alternating 
 * indexes. If the lists are of unequal length, the remaining elements of the 
 * longer list are left at the end of a1.
 */
public void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    int size1 = a1.size();
    int size2 = a2.size();
    int index1 = 0;
    int index2 = 0;
    int n = 0;

    while(index1 < size1 || index2 < size2) {
        if(index1 < size1 && n % 2 == 0) {
            a1.add(a1.get(index1));
            index1++;
        } else if(index2 < size2 && n % 2 == 1) {
            a1.add(a2.get(index2));
            index2++;
        }
        n++;
    }

    a1.subList(0, size1).clear();
}
