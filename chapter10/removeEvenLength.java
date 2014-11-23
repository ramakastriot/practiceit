/* Write a method removeEvenLength that takes an ArrayList of Strings as a 
 * parameter and that removes all of the strings of even length from the list.
 */
public void removeEvenLength(ArrayList<String> list) {
    ArrayList<String> temp = new ArrayList<String>();

    for(int i = 0; i < list.size(); i++) {
        if(list.get(i).length() % 2 == 1)
            temp.add(list.get(i));
    }

    list.clear();
    list.addAll(temp);
}
