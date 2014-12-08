/* Write a method reverse that accepts a Map from integers to strings as a 
 * parameter and returns a new Map of strings to integers that is the 
 * original's "reverse". The reverse of a map is defined here to be a new map 
 * that uses the values from the original as its keys and the keys from the 
 * original as its values. Since a map's values need not be unique but its 
 * keys must be, it is acceptable to have any of the original keys as the 
 * value in the result.
 */
public Map<String, Integer> reverse(Map<Integer, String> map) {
    HashMap<String, Integer> reversed = new HashMap<String, Integer>();

    for(int key : map.keySet()) {
        String value = map.get(key);

        if(!reversed.containsKey(value)) {
            reversed.put(value, key);
        }
    }

    return reversed;
}
