/* Write a method removeLeaves that removes the leaves from a tree.  If your 
 * method is called on an empty tree, the method does not change the tree 
 * because there are no nodes of any kind (leaf or not).
 */
public void removeLeaves() {
    overallRoot = removeLeaves(overallRoot);
}

private IntTreeNode removeLeaves(IntTreeNode node) {
    if(node == null)
        return null;
        
    if(node.left == null && node.right == null)
        return null;
        
    node.left = removeLeaves(node.left);
    node.right = removeLeaves(node.right);
    return node;
}
