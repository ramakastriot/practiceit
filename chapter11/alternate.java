/* Write a method called alternate that accepts two Lists of integers as its 
 * parameters and returns a new List containing alternating elements from the 
 * two lists. If the lists do not contain the same number of elements, the 
 * remaining elements from the longer list should be placed consecutively at 
 * the end. Do not modify the parameter lists passed in.
 */
public List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
    List<Integer> list = new LinkedList<Integer>();
    int size1 = list1.size();
    int size2 = list2.size();
    int index1 = 0;
    int index2 = 0;
    boolean flag = true;

    while(index1 < size1 || index2 < size2) {
        if(index1 < size1 && flag) {
            list.add(list1.get(index1));
            index1++;
        } else if(index2 < size2 && !flag) {
            list.add(list2.get(index2));
            index2++;
        }
        flag = !flag;
    }
 
    return list;
}
