/* Write a method swapPairs that switches the order of values in an ArrayList 
 * of Strings in a pairwise fashion. Your method should switch the order of 
 * the first two values, then switch the order of the next two, switch the 
 * order of the next two, and so on. If there are an odd number of values in 
 * the list, the final element is not moved.
 */
public void swapPairs(ArrayList<String> list) {
    for(int i = 0; i <= list.size() - 2; i += 2) {
        String str = list.get(i + 1);
        list.set(i + 1, list.get(i));
        list.set(i, str);
    }
}
