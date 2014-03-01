/* Write a method countLeftNodes that returns the number of left children in 
 * the tree. A left child is a node that appears as the root of the left-hand 
 * subtree of another node. An empty tree has 0 left nodes.
 */
public int countLeftNodes() {
    return countLeftNodes(overallRoot);
}

private int countLeftNodes(IntTreeNode node) {
    if(node == null)
        return 0;
        
    int count = countLeftNodes(node.right);
    
    if(node.left != null)
        count += 1 + countLeftNodes(node.left);
        
    return count;
}
