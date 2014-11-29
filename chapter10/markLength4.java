/* Write a method markLength4 that takes an ArrayList of Strings as a 
 * parameter and that places a string of four asterisks "****" in front of 
 * every string of length 4.
 */
public void markLength4(ArrayList<String> list) {
    ArrayList<String> holder = new ArrayList<String>();

    for(String str : list) {
        if(str.length() == 4) {
            holder.add("****");
        }
        holder.add(str);
    }

    list.clear();
    list.addAll(holder);
}
