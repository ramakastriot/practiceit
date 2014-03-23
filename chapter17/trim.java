/* Write a method trim that could be added to the IntTree class. The method 
 * accepts minimum and maximum integers as parameters and removes from the 
 * tree any elements that are not within that range, inclusive. For this 
 * method you should assume that your tree is a binary search tree (BST) and 
 * that its elements are in valid BST order. Your method should maintain the 
 * BST ordering property of the tree.
 */
public void trim(int min, int max) {
    overallRoot = trim(overallRoot, min, max);
}

private IntTreeNode trim(IntTreeNode node, int min, int max) {
    if(node == null)
        return null;
        
    if(node.data < min)
        return trim(node.right, min, max);
        
    if(node.data > max)
        return trim(node.left, min, max);
        
    node.left = trim(node.left, min, max);
    node.right = trim(node.right, min, max);
    return node;
}
