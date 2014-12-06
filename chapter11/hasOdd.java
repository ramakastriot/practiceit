/* Write a method hasOdd that takes a Set of integers as a parameter and that 
 * returns true if the set contains at least one odd integer, and false 
 * otherwise. If passed the empty set, your method should return false.
 */
public boolean hasOdd(Set<Integer> set) {
    for(int n : set) {
        if(n % 2 == 1)
            return true;
    }

    return false;
}
