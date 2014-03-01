/* Write a method depthSum that returns the sum of the values stored in a 
 * binary tree of integers weighted by the depth of each value. You should 
 * return the value at the overallRoot plus 2 times the values stored at the 
 * next level of the tree plus 3 times the values stored at the next level of 
 * the tree plus 4 times the values stored at the next level of the tree and 
 * so on.
 */
public int depthSum() {
    return depthSum(overallRoot, 1);
}

private int depthSum(IntTreeNode node, int level) {
    if(node == null)
        return 0;
        
    return level * node.data + depthSum(node.left, level + 1) +
        depthSum(node.right, level + 1);
}
