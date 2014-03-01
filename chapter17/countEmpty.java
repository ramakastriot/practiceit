/* Write a method countEmpty that returns the number of empty branches in a 
 * tree. An empty tree is considered to have one empty branch (the tree 
 * itself). For non-empty trees, your method(s) should count the total number 
 * of empty branches among the nodes of the tree. A leaf node has two empty 
 * branches. A node with one non-empty child has one empty branch. A node with 
 * two non-empty children (a full branch) has no empty branches.
 */
public int countEmpty() {
    return countEmpty(overallRoot);
}

private int countEmpty(IntTreeNode node) {
    if(node == null)
        return 1;
        
    return countEmpty(node.left) + countEmpty(node.right);
}
