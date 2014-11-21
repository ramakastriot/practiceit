/* Write a method removeDuplicates that takes as a parameter a sorted
 * ArrayList of Strings and that eliminates any duplicates from the list.
 */
public void removeDuplicates(ArrayList<String> list) {
    ArrayList<String> temp = new ArrayList<String>();

    for(int i = 0; i < list.size(); i++) {
        if(temp.size() == 0 || !temp.get(temp.size() - 1).equals(list.get(i)))
            temp.add(list.get(i));
    }

    list.clear();
    list.addAll(temp);
}
