/* Write a method stutter that takes an ArrayList of Strings and an integer k 
 * as parameters and that replaces every string with k copies of that string. 
 * If k is 0 or negative, the list should be empty after the call.
 */
public void stutter(ArrayList<String> list, int k) {
    ArrayList<String> temp = new ArrayList<String>();

    for(String str : list) {
        for(int i = 0; i < k; i++)
            temp.add(str);
    }

    list.clear();
    list.addAll(temp);
}
