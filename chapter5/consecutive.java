/* Write a method named consecutive that accepts three integers as parameters 
 * and returns true if they are three consecutive numbers; that is, if the 
 * numbers can be arranged into an order such that there is some integer k 
 * such that the parameters' values are k, k+1, and k+2. Your method should 
 * return false if the integers are not consecutive. Note that order is not 
 * significant; your method should return the same result for the same three 
 * integers passed in any order.
 */
public boolean consecutive(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
    int mid = a + b + c - max - min;
    
    return max == mid + 1 && mid == min + 1;
}
