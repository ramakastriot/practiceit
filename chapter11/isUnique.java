/* Write a method isUnique that accepts a Map from strings to strings as a 
 * parameter and returns true if no two keys map to the same value (and false 
 * if any two or more keys do map to the same value). The empty map is 
 * considered to be unique, so your method should return true if passed an 
 * empty map.
 */
public boolean isUnique(Map<String, String> map) {
    HashSet<String> set = new HashSet<String>();

    for(String key : map.keySet()) {
        String value = map.get(key);

        if(set.contains(value))
            return false;

        set.add(value);
    }

    return true;
}
