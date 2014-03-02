/* Write a method countEvenBranches that returns the number of branch nodes in 
 * a binary tree that contain even numbers. A branch node is one that has one 
 * or two children (i.e., not a leaf node). An empty tree has 0 even branches.
 */
public int countEvenBranches() {
    return countEvenBranches(overallRoot);
}

private int countEvenBranches(IntTreeNode node) {
    if(node == null)
        return 0;
        
    int count = 0;
    
    if(node.data % 2 == 0 && (node.left != null || node.right != null))
        count ++;
        
    return count + countEvenBranches(node.left) +
        countEvenBranches(node.right);
}
