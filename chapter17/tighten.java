/* Write a method tighten that eliminates branch nodes that have only one
 * child.
 */
public void tighten() {
    overallRoot = tighten(overallRoot);
}

private IntTreeNode tighten(IntTreeNode node) {
    if(node == null)
        return null;
        
    if(node.left == null && node.right != null)
        return tighten(node.right);
        
    if(node.left != null && node.right == null)
        return tighten(node.left);
        
    node.left = tighten(node.left);
    node.right = tighten(node.right);
    return node;
}
