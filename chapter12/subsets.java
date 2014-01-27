/* Write a method subsets that uses recursive backtracking to find every 
 * possible sub-list of a given list. A sub-list of a list L contains 0 or 
 * more of L's elements. Your method should accept a List of strings as its 
 * parameter and print every sub-list that could be created from elements of 
 * that list, one per line.
 */
public void subsets(List<String> list) {
    subsets(list, 0, list.size());
}

public void subsets(List<String> list, int start, int rem) {
    if(rem == 0) {
        System.out.println(list);
        return;
    }
    
    subsets(list, start + 1, rem - 1);
    String str = list.remove(start);
    subsets(list, start, rem - 1);
    list.add(start, str);
}
