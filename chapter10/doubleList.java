/* Write a method doubleList that takes an ArrayList of Strings as a parameter 
 * and that replaces every string with two of that string.
 */
public void doubleList(ArrayList<String> arr) {
    ArrayList<String> temp = new ArrayList<String>();
    
    for(String str : arr) {
        temp.add(str);
        temp.add(str);
    }
    
    arr.clear();
    
    for(String str : temp)
        arr.add(str);
}
