/* Write a method completeToLevel that accepts an integer n as a parameter and 
 * that adds nodes to a tree so that the first n levels are complete. A level 
 * is complete if every possible node at that level is not null. We will use 
 * the convention that the overall root is at level 1, it's children are at 
 * level 2, and so on. You should preserve any existing nodes in the tree. Any 
 * new nodes added to the tree should have -1 as their data. Keep in mind that 
 * your method might need to fill in several different levels. Your method 
 * should throw an IllegalArgumentException if passed a value for level that 
 * is less than 1.
 */
public void completeToLevel(int n) {
    overallRoot = completeToLevel(overallRoot, n);
}

private IntTreeNode completeToLevel(IntTreeNode node, int n) {
    if(n < 1)
        throw new IllegalArgumentException();
        
    if(node == null)
        node = new IntTreeNode(-1);
        
    if(n == 1)
        return node;
        
    node.left = completeToLevel(node.left, n - 1);
    node.right = completeToLevel(node.right, n - 1);
    return node;
}
