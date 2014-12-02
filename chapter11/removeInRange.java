/* Write a method called removeInRange that accepts four parameters: a List of 
 * integers, an element value, a starting index, and an ending index. The 
 * method's behavior is to remove all occurrences of the given element that 
 * appear in the list between the starting index (inclusive) and the ending 
 * index (exclusive). Other values and occurrences of the given value that 
 * appear outside the given index range are not affected.
 */
public void removeInRange(List<Integer> list, int val, int start, int end) {
    if(start > end)
        return;

    List<Integer> holder = new LinkedList<Integer>();

    for(int i = 0; i < start; i++)
        holder.add(list.get(i));

    for(int i = start; i < end; i++) {
        if(list.get(i) != val)
            holder.add(list.get(i));
    }

    for(int i = end; i < list.size(); i++)
        holder.add(list.get(i));

    list.clear();
    list.addAll(holder);
}
