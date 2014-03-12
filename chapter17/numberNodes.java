/* Write a method numberNodes that changes the data stored in a binary tree, 
 * assigning sequential integers starting with 1 to each node so that a 
 * pre-order traversal will produce the numbers in order(1, 2, 3, etc.). You 
 * are not to change the structure of the tree. You are simply changing the 
 * values stored in the data fields. Your method should return a count of how 
 * many nodes were in the tree.
 */
public int numberNodes() {
    return numberNodes(overallRoot, 1);
}

private int numberNodes(IntTreeNode node, int number) {
    if(node == null)
        return 0;
        
    node.data = number;
    int countLeft = numberNodes(node.left, number + 1);
    int countRight = numberNodes(node.right, number + countLeft + 1);
    
    return 1 + countLeft + countRight;
}
