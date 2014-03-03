/* Write a method printLevel that accepts an integer parameter n and that 
 * prints the values at level n from the left to right, one per line. We will 
 * use the convention that the overallRoot is at level 1, that its children 
 * are at level 2, and so on. If there are no values at the level, your method 
 * should produce no output. Your method should throw an 
 * IllegalArgumentException if passed a value for a level n that is less 
 * than 1.
 */
public void printLevel(int n) {
    if(n < 1)
        throw new IllegalArgumentException();
        
    printLevel(overallRoot, n);
}

private void printLevel(IntTreeNode node, int n) {
    if(node == null)
        return;
        
    if(n == 1) {
        System.out.println(node.data);
        return;
    }
    
    printLevel(node.left, n - 1);
    printLevel(node.right, n - 1);
}
