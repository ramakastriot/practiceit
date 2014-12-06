/* Write a method contains3 that accepts a List of strings as a parameter and 
 * returns true if any single string occurs at least 3 times in the list, and 
 * false otherwise. Use a map as auxiliary storage.
 */
public boolean contains3(List<String> list) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    for(String str : list) {
        if(map.containsKey(str)) {
            map.put(str, map.get(str) + 1);

            if(map.get(str) == 3)
                return true;
        } else {
            map.put(str, 1);
        }
    }

    return false;
}
