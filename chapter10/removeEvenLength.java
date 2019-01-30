/* Write a method removeEvenLength that takes an ArrayList of Strings as a 
 * parameter and that removes all of the strings of even length from the list.
 */
public void removeEvenLength(ArrayList<String> list) {

    for(int head = 0; head < list.size(); head++) {
        if (list.get(head).length() % 2 == 0) {
            list.remove(head);
            head--;
        }
    }
}
