/* Write a method isFull that returns whether or not a binary tree is full 
 * (true, if it is, false if otherwise). A full binary tree is one in which 
 * every node has 0 or 2 children. By definition, the empty tree is considered 
 * full.
 */
public boolean isFull() {
    return isFull(overallRoot);
}

private boolean isFull(IntTreeNode node) {
    if(node == null)
        return true;
        
    if(node.left == null && node.right != null)
        return false;
        
    if(node.left != null && node.right == null)
        return false;
        
    return isFull(node.left) && isFull(node.right);
}
