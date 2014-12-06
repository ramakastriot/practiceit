/* Write a method removeEvenLength that takes a Set of strings as a parameter
 * and that removes all of the strings of even length from the set.
 */
public void removeEvenLength(Set<String> set) {
    LinkedList<String> holder = new LinkedList<String>();

    for(String str : set) {
        if(str.length() % 2 == 1)
            holder.add(str);
    }

    set.clear();
    set.addAll(holder);
}
