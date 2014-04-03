/* Write a method that adds nodes until the binary tree is a "perfect" tree. A 
 * perfect binary tree is one where all leaves are at the same level. Another 
 * way of thinking of it is that you are adding dummy nodes to the tree until 
 * every path from the root to a leaf is the same length. A perfect tree's 
 * shape is exactly triangular and every branch node has exactly two children. 
 * Each node you add to the tree should store the value 0.
 */
public void makePerfect() {
    int h = height();
    overallRoot = makePerfect(overallRoot, h);
}

private IntTreeNode makePerfect(IntTreeNode node, int h) {
    if(h <= 0)
        return null;
        
    if(node == null)
        node = new IntTreeNode(0);
        
    node.left = makePerfect(node.left, h - 1);
    node.right = makePerfect(node.right, h - 1);
    return node;
}

public int height() {
    return height(overallRoot);
}

private int height(IntTreeNode root) {
    if(root == null) {
        return 0;
    } else {
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
