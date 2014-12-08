/* Write a method intersect that takes two Maps of strings to integers as 
 * parameters and that returns a new map whose contents are the intersection 
 * of the two. The intersection of two maps is defined here as the set of keys 
 * and values that exist in both maps. So if some key K maps to value V in 
 * both the first and second map, include it in your result. If K does not 
 * exist as a key in both maps, or if K does not map to the same value V in 
 * both maps, exclude that pair from your result.
 */
public Map<String, Integer> intersect(Map<String, Integer> m1,
    Map<String, Integer> m2) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    for(String key : m1.keySet()) {
        if(m2.containsKey(key) && m1.get(key) == m2.get(key))
            map.put(key, m1.get(key));
    }

    return map;
}
