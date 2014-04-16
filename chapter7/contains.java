/* Write a static method named contains that accepts two arrays of integers a1 
 * and a2 as parameters and that returns a boolean value indicating whether or 
 * not a2's sequence of elements appears in a1 (true for yes, false for no). 
 * The sequence of elements in a2 may appear anywhere in a1 but must appear 
 * consecutively and in the same order. You may assume that both arrays passed 
 * to your method will have lengths of at least 1. You may not use any Strings 
 * to help you solve this problem, nor methods that produce Strings such as 
 * Arrays.toString.
 */
public boolean contains(int[] a1, int[] a2) {
    for(int i = 0; i <= a1.length - a2.length; i++) {
        boolean c = true;
        
        for(int j = 0; j < a2.length; j++) {
            if(a1[i + j] != a2[j]) {
                c = false;
                break;
            }
        }
        
        if(c)
            return true;
    }
    
    return false;
}
