/* Write a method equals that could be added to the IntTree class. The method 
 * accepts another binary tree of integers as a parameter and compares the two 
 * trees to see if they are equal to each other. Two trees are considered 
 * equal if they have exactly the same structure and store the same values. 
 * Each node in one tree must have a corresponding node in the other tree in 
 * the same location relative to the root and storing the same value. Two 
 * empty trees are considered equal to each other.
 */
public boolean equals2(IntTree t2) {
    return equals2(overallRoot, t2.overallRoot);
}

private boolean equals2(IntTreeNode n1, IntTreeNode n2) {
    if(n1 == null && n2 == null)
        return true;
        
    if(n1 == null && n2 != null)
        return false;
        
    if(n1 != null && n2 == null)
        return false;
        
    return n1.data == n2.data && equals2(n1.left, n2.left) &&
        equals2(n1.right, n2.right);
}
