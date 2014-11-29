/* Write a method removeShorterStrings that takes an ArrayList of Strings as a 
 * parameter and that removes from each successive pair of values the shorter 
 * string in the pair. If there is a tie (both strings have the same length), 
 * your method should remove the first string in the pair. If there is an odd 
 * number of strings in the list, the final value should be kept in the list.
 */
public void removeShorterStrings(ArrayList<String> list) {
    ArrayList<String> holder = new ArrayList<String>();
    int i = 0;

    while(i <= list.size() - 2) {
        if(list.get(i).length() > list.get(i+1).length())
            holder.add(list.get(i));
        else
            holder.add(list.get(i+1));

        i += 2;
    }

    if(i == list.size() - 1)
        holder.add(list.get(i));

    list.clear();
    list.addAll(holder);
}
