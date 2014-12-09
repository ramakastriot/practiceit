/* Write a method rarest that accepts a map whose keys are strings and whose 
 * values are integers as a parameter and returns the integer value that 
 * occurs the fewest times in the map. If there is a tie, return the smaller 
 * integer value. If the map is empty, throw an exception.
 */
public int rarest(Map<String, Integer> map) {
    HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
    int rarest = Integer.MAX_VALUE;
    int numRarest = Integer.MAX_VALUE;

    for(String key : map.keySet()) {
        int value = map.get(key);

        if(hashmap.containsKey(value)) {
            hashmap.put(value, hashmap.get(value) + 1);
        } else {
            hashmap.put(value, 1);
        }
    }

    for(int key : hashmap.keySet()) {
        int value = hashmap.get(key);

        if(value < numRarest) {
            rarest = key;
            numRarest = value;
        } else if(value == numRarest) {
            rarest = key < rarest ? key : rarest;
        }
    }

    return rarest;
}
