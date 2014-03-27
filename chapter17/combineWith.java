/* Write a method combineWith that could be added to the IntTree class. The 
 * method accepts another binary tree of integers as a parameter and combines 
 * the two trees into a new third tree which is returned. The new tree's 
 * structure should be a union of the structures of the two original trees. It 
 * should have a node in any location where there was a node in either of the 
 * original trees (or both). The nodes of the new tree should store an integer 
 * indicating which of the original trees had a node at that position (1 if 
 * just the first tree had the node, 2 if just the second tree had the node, 3 
 * if both trees had the node).
 */
public IntTree combineWith(IntTree t2) {
    IntTree t3 = new IntTree();
    t3.overallRoot = combineWith(overallRoot, t2.overallRoot);
    return t3;
}

private IntTreeNode combineWith(IntTreeNode n1, IntTreeNode n2) {
    if(n1 == null && n2 == null)
        return null;
        
    IntTreeNode n3;
    
    if(n1 == null) {
        n3 = new IntTreeNode(2);
        n3.left = combineWith(null, n2.left);
        n3.right = combineWith(null, n2.right);
    } else if(n2 == null) {
        n3 = new IntTreeNode(1);
        n3.left = combineWith(n1.left, null);
        n3.right = combineWith(n1.right, null);
    } else {
        n3 = new IntTreeNode(3);
        n3.left = combineWith(n1.left, n2.left);
        n3.right = combineWith(n1.right, n2.right);
    }
    
    return n3;
}
