/* Write a method toString2 for a binary tree of integers. The method should 
 * return "empty" for an empty tree. For a leaf node, it should return the 
 * data in the node as a String. For a branch node, it should return a 
 * parenthesized String that has three elements separated by commas:
 *
 * The data at the root.
 * A String representation of the left subtree.
 * A String representation of the right subtree.
 */
public String toString2() {
    return toString2(overallRoot);
}

private String toString2(IntTreeNode node) {
    if(node == null)
        return "empty";
        
    if(node.left == null && node.right == null)
        return String.valueOf(node.data);
        
    return "(" + node.data + ", " + toString2(node.left) + ", " +
        toString2(node.right) + ")";
}
